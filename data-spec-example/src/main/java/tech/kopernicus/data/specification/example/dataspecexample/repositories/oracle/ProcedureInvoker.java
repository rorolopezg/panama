package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.CustSiseRamo;
import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;

@Repository

public class ProcedureInvoker {
    //@PersistenceContext(unitName="oraclePU")
    @Autowired
    @Qualifier("oracleEntityManagerFactory")
    private EntityManager entityManager;

    @Autowired
    @Qualifier("oracleDataSource")
    private DataSource dataSource;

    @Transactional
    public List<People> getPeople() {
        List <People> peoples = new ArrayList<>();
        peoples.add(new People(1L, "Rodrigo", "López"));
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("RMLG_PKG.TEST", People.class);
        storedProcedure.registerStoredProcedureParameter("p_in", People.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("p_out", String.class, ParameterMode.OUT);
        storedProcedure.setParameter("p_in", peoples);
        storedProcedure.execute();
        String pOut = storedProcedure.getParameter("p_out").getName();
        System.out.println(pOut);
        
        return peoples;
    }

    public List<CustSiseRamo> getRamos(Integer ramo) {
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("get_sise_ramos", CustSiseRamo.class);
        
        storedProcedure.registerStoredProcedureParameter("p_ramo_id", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("po_ref_cursor", void.class, ParameterMode.REF_CURSOR);
        storedProcedure.setParameter("p_ramo_id", ramo);
        
        //Solución: cuando se utilizan el entityManager para invocar Stored Procedures que devuelven un REF_CURSOR, no se debe llamar al método excecute().
        //Se debe llamar en su lugar al método getResultList.
        //Referencia: https://stackoverflow.com/questions/55929114/session-entitymanager-closed-when-using-storedprocedurequery 
        //Por tanto la siguiente línea debe ser comentada:
        //storedProcedure.execute(); <-- Comentar esta línea
    	
        List<CustSiseRamo> ramos = storedProcedure.getResultList().stream().toList();
    	
        return ramos;
    }

    public List<CustSiseRamo> getRamos2(Integer ramo) {
        Query query = entityManager.createQuery("select r from CustSiseRamo r");
    	
        List<CustSiseRamo> ramos = query.getResultList();
        return ramos;
    }

    public void callTestProcedure3() throws SQLException {
        int size = 2;
        OracleConnection conn = DataSourceUtils.getConnection(dataSource).unwrap(OracleConnection.class);
        CallableStatement cstmt = null;
        try {
            Struct[] structs = new Struct[size];
            Object[] objData1 = {1, "name1", "value1"};
            structs[0] = conn.createStruct("RMLG_OBJECT", objData1);

            Object[] objData2 = {2, "name2", "value2"};
            structs[1] = conn.createStruct("RMLG_OBJECT", objData2);
            
            Array array = conn.createOracleArray("RMLG_TYPE_TABLE", structs);
            //ARRAY array = new ARRAY(arrayDesc, conn, structs);
            cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?, ?) }");
            cstmt.setArray(1, array);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);

            cstmt.execute();
            String result = cstmt.getString(2);
            System.out.println("Resultado: " + result);

            ResultSet rs = (ResultSet)cstmt.getObject (3);
            System.out.println("Imprimiendo Resultset:");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } finally {
            //f (cstmt != null) cstmt.close();
            //if (conn != null) conn.close();
        }
    } 

    /*

    public void callTestProcedure4() throws SQLException {
        OracleConnection conn = DataSourceUtils.getConnection(dataSource).unwrap(OracleConnection.class);
        CallableStatement cstmt = null;
        try {
            Object[] objData1 = {1, "name1", "value1"};
            Struct struct1 = conn.createStruct("RMLG_OBJECT", objData1);

            Object[] objData2 = {2, "name2", "value2"};
            Struct struct2 = conn.createStruct("RMLG_OBJECT", objData2);

            Struct[] structs = {struct1, struct2};
            
            Array array = conn.createOracleArray("RMLG_TYPE_TABLE", structs);
            //ARRAY array = new ARRAY(arrayDesc, conn, structs);
            cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?, ?) }");
            cstmt.setArray(1, array);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);

            cstmt.execute();
            String result = cstmt.getString(2);
            System.out.println("Resultado: " + result);

            ResultSet rs = (ResultSet)cstmt.getObject (3);
            System.out.println("Imprimiendo Resultset:");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } finally {
            //f (cstmt != null) cstmt.close();
            //if (conn != null) conn.close();
        }
    } 
     */

}