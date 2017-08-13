package structural.facade;

import java.sql.Connection;

public class OracleReportManager {

    public static Connection getOracleDBConnection(){
        System.out.println("Oracle - getting database connection");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        System.out.println("Oracle - getting data from "+tableName+" table and generating pdf report");
    }

    public void generateOracleXMLReport(String tableName, Connection con){
        System.out.println("Oracle - getting data from "+tableName+" table and generating xml report");
    }
}
