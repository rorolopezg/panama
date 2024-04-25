package tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.OfferApiOut;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.OfferApiParamIn;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapi.Ropciones;
import tech.kopernicus.data.specification.example.dataspecexample.model.dto.offerapicontract.OfferRequestBody;
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


    public OfferApiOut getOffers(OfferApiParamIn paramIn) throws SQLException {
        int size = 2;
        OracleConnection conn = DataSourceUtils.getConnection(dataSource).unwrap(OracleConnection.class);
        CallableStatement cstmt = null;
        List <Ropciones> aList = new ArrayList<>();
        List <Ropciones> bList = new ArrayList<>();
        List <Ropciones> cList = new ArrayList<>();
        String ok = null;
        String mensaje = null;
        OfferApiOut apiOut = new OfferApiOut();
        apiOut.setOpcionA(aList);
        apiOut.setOpcionB(bList);
        apiOut.setOpcionC(cList);
        OfferRequestBody body = paramIn.getBody();
        try {
            cstmt = conn.prepareCall("{ call seguros.pkg_nube_seguros2.cotiza_opciones_auto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");
            cstmt.setLong(1, Long.parseLong(body.getProductId())); //plan
            cstmt.setString(2, body.getInsured().getPid()); //asegurado
            cstmt.setLong(3, body.getVehicle().getProductionYear()); //año
            cstmt.setString(4, body.getVehicle().getUsage()); //uso
            cstmt.setString(5, body.getRamo()); //ramo
            cstmt.setDouble(6, body.getVehicle().getValue()); //suma asegurada
            if (body.getVehicle().getTonage() != null)
                cstmt.setDouble(7, body.getVehicle().getTonage()); //peso
            else 
                cstmt.setNull(7, OracleTypes.NULL);
            if (body.getVehicle().getSeatsNum() != null)
                cstmt.setLong(8, body.getVehicle().getSeatsNum()); //capacidad
            else
                cstmt.setNull(8, OracleTypes.NULL);
            cstmt.setString(9, body.getVehicle().getMake()); //marca
            cstmt.setString(10, body.getVehicle().getModel()); //modelo
            cstmt.setString(11, body.getVehicle().getType()); //tipo

            //cstmt.registerOutParameter(12, OracleTypes.ARRAY); //OpcionA
            cstmt.registerOutParameter(12, OracleTypes.ARRAY,"SEGUROS.T_OPCIONES");
            cstmt.registerOutParameter(13, OracleTypes.ARRAY,"SEGUROS.T_OPCIONES");
            cstmt.registerOutParameter(14, OracleTypes.ARRAY,"SEGUROS.T_OPCIONES");
            cstmt.registerOutParameter(15, OracleTypes.VARCHAR); //p_ok
            cstmt.registerOutParameter(16, OracleTypes.VARCHAR); //p_mensaje

            cstmt.execute();

            Object[] opcionA = (Object[]) ((Array) cstmt.getObject(12)).getArray(); //OpcionA
            Object[] opcionB = (Object[]) ((Array) cstmt.getObject(13)).getArray(); //OpcionA
            Object[] opcionC = (Object[]) ((Array) cstmt.getObject(14)).getArray(); //OpcionA

            ok = cstmt.getString(15);
            mensaje = cstmt.getString(16);

            for (Object datum : opcionA) {
                buildRopciones(aList, datum);
            }

            for (Object datum : opcionB) {
                buildRopciones(aList, datum);
            }

            for (Object datum : opcionC) {
                buildRopciones(aList, datum);
            }

            apiOut.setOk(ok);
            apiOut.setMensaje(mensaje);

            return apiOut;

        } finally {
            if (cstmt != null) cstmt.close();
            if (conn != null) conn.close();
        }
    }

    private void buildRopciones(List<Ropciones> aList, Object datum) throws SQLException {
        Object[] o = ((Struct) datum).getAttributes();
        aList.add(
            new Ropciones(
                (String) o[0],
                (String) o[1],
                (Double) o[2],
                (Double) o[3],
                (Double) o[4],
                (Double) o[5],
                (Double) o[6],
                (Boolean) o[7],
                (Boolean) o[8]
            )
        );
    } 
}