package structural.facade;

import java.sql.Connection;

public class ReportManagerFacade {

    public static void generateReport(DBType dbType, ReportType reportType, String tableName){
        Connection connection = null;
        switch (dbType){
            case MYSQL:
                connection = MySqlReportManager.getMySqlDBConnection();
                MySqlReportManager mySqlReportManager = new MySqlReportManager();
                switch(reportType){
                    case XML:
                        mySqlReportManager.generateMySqlXMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlReportManager.generateMySqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleReportManager.getOracleDBConnection();
                OracleReportManager oracleReportManager = new OracleReportManager();
                switch(reportType){
                    case XML:
                        oracleReportManager.generateOracleXMLReport(tableName, connection);
                        break;
                    case PDF:
                        oracleReportManager.generateOraclePDFReport(tableName, connection);
                        break;
                }
                break;
        }

    }

    public static enum DBType {
        MYSQL,ORACLE;
    }

    public static enum ReportType {
        XML,PDF;
    }
}
