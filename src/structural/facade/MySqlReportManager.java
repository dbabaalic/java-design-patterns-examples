package structural.facade;

import java.sql.Connection;

public class MySqlReportManager {

    public static Connection getMySqlDBConnection(){
        System.out.println("MySql - getting database connection");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        System.out.println("MySql - getting data from "+tableName+" table and generating pdf report");
    }

    public void generateMySqlXMLReport(String tableName, Connection con){
        System.out.println("MySql - getting data from "+tableName+" table and generating xml report");
    }
}
