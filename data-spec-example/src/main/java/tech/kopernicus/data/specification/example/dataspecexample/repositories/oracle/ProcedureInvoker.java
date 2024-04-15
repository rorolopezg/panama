package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;

import tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle.People;

@Repository

public class ProcedureInvoker {
    @PersistenceContext(unitName="oracleEntityManagerFactory")
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


    public void callTestProcedure2() throws SQLException {
        Session session = entityManager.unwrap(Session.class);

        Integer bookCount = session.doReturningWork(new ReturningWork<Integer>() {
            @Override
            public Integer execute(Connection con) throws SQLException {
                OracleConnection conn = DataSourceUtils.getConnection(dataSource).unwrap(OracleConnection.class);
                //OracleConnection conn = con.unwrap(OracleConnection.class);
                CallableStatement cstmt = null;
                try {
                    //StructDescriptor structDesc = StructDescriptor.createDescriptor("RMLG_OBJECT", conn);
                    //ArrayDescriptor arrayDesc = ArrayDescriptor.createDescriptor("RMLG_TYPE_TABLE", conn);
                    Object[] objData1 = {1, "name1", "value1"};
                    Struct struct1 = conn.createStruct("RMLG_OBJECT", objData1);
        
                    Object[] objData2 = {2, "name2", "value2"};
                    Struct struct2 = conn.createStruct("RMLG_OBJECT", objData2);
        
                    Struct[] structs = {struct1, struct2};
                    Array array = conn.createOracleArray("RMLG_TYPE_TABLE", structs);
                    //ARRAY array = new ARRAY(arrayDesc, conn, structs);
                    cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?) }");
                    cstmt.setArray(1, array);
                    cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
        
                    cstmt.execute();
                    String result = cstmt.getString(2);
                    System.out.println("Resultado: " + result);
                } finally {
                    if (cstmt != null) cstmt.close();
                    if (conn != null) conn.close();
                }
                return 1;
            }
        });
    } 


    /* 
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void callTestProcedure3() {
        jdbcTemplate.execute(connection -> {
            OracleConnection conn = connection.unwrap(OracleConnection.class);
            CallableStatement cstmt = null;
            try {
                //StructDescriptor structDesc = StructDescriptor.createDescriptor("RMLG_OBJECT", conn);
                //ArrayDescriptor arrayDesc = ArrayDescriptor.createDescriptor("RMLG_TYPE_TABLE", conn);
                Object[] objData1 = {1, "name1", "value1"};
                Struct struct1 = conn.createStruct("RMLG_OBJECT", objData1);
    
                Object[] objData2 = {2, "name2", "value2"};
                Struct struct2 = conn.createStruct("RMLG_OBJECT", objData2);
    
                Struct[] structs = {struct1, struct2};
                Array array = conn.createOracleArray("RMLG_TYPE_TABLE", structs);
                //ARRAY array = new ARRAY(arrayDesc, conn, structs);
                cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?) }");
                cstmt.setArray(1, array);
                cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
    
                cstmt.execute();
                String result = cstmt.getString(2);
                System.out.println("Resultado: " + result);
            } finally {
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            }
        });
    }
    */

    public void callTestProcedure3() throws SQLException {
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
            cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?) }");
            cstmt.setArray(1, array);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);

            cstmt.execute();
            String result = cstmt.getString(2);
            System.out.println("Resultado: " + result);
        } finally {
            if (cstmt != null) cstmt.close();
            if (conn != null) conn.close();
        }
    } 

    public void callTestProcedure4() throws SQLException {
        Connection conn = DataSourceUtils.getConnection(dataSource);
        CallableStatement cstmt = null;
        List<Object> addressList = new ArrayList<>();
        Struct struct = null;
        Object[] objData = null;
        try {
            objData = new Object [] {1, "name1", "value1"};
            struct = conn.createStruct("RMLG_OBJECT", objData);
            addressList.add(struct);

            objData = new Object [] {2, "name2", "value2"};
            struct = conn.createStruct("RMLG_OBJECT", objData);
            addressList.add(struct);

            //Struct[] structs = {struct1, struct2};
            
            Array array = conn.createArrayOf("RMLG_OBJECT", addressList.toArray());
            //ARRAY array = new ARRAY(arrayDesc, conn, structs);
            cstmt = conn.prepareCall("{ call RMLG_PKG.TEST(?, ?) }");
            cstmt.setArray(1, array);
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);

            cstmt.execute();
            String result = cstmt.getString(2);
            System.out.println("Resultado: " + result);
        } finally {
            if (cstmt != null) cstmt.close();
            if (conn != null) conn.close();
        }
    } 

}