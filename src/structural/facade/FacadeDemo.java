package structural.facade;

import java.sql.Connection;

public class FacadeDemo
{
    public static void main( String[] args ) {

        //without Facade Design Pattern
        MySqlReportManager mySqlReportManager = new MySqlReportManager();
        Connection mySqlConnection = MySqlReportManager.getMySqlDBConnection();
        mySqlReportManager.generateMySqlPDFReport("Employee", mySqlConnection);


        //with Facade Design Pattern
        ReportManagerFacade.generateReport(ReportManagerFacade.DBType.MYSQL, ReportManagerFacade.ReportType.PDF, "Employee");
    }

}
