package BitmapMajorProject;

import java.sql.*;

public class BitmapMajorProject {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/employees";
    static final String USER = "root";
    static final String PASS = "root";

    static ResultSet rs = null, rsColumn = null;
    static Statement stmt = null, stmtColumn = null;
    static Connection conn = null;
    static String sqlQuery = null;
    static int empNo;
    static ResultSetMetaData metaData = null;

    static void insertAndUpdateBitmapDepartment() {
        try {
            int arrBitmapDept[] = new int[9];
            String deptNo[];
            int deptCount = 0;
            int[] result;
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmtColumn = conn.createStatement();
            sqlQuery = "CREATE TABLE IF NOT EXISTS bitmapdepartment(emp_no INT NOT NULL UNIQUE , "
                    + "d001 INT "
                    + ",d002 INT ,"
                    + "d003 INT ,"
                    + "d004 INT ,"
                    + "d005 INT ,"
                    + "d006 INT ,"
                    + "d007 INT ,"
                    + "d008 INT ,"
                    + "d009 INT ,"
                    + "PRIMARY KEY (emp_no))";
            System.out.println(sqlQuery);
            stmt.executeUpdate(sqlQuery);
            sqlQuery = "select emp_no, dept_no from employee_department";
            rs = stmt.executeQuery(sqlQuery);
            rsColumn = stmtColumn.executeQuery("SELECT * FROM bitmapdepartment");
            metaData = rsColumn.getMetaData();
            deptCount = metaData.getColumnCount();
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            while (rs.next()) {
                empNo = rs.getInt("emp_no");
                sqlQuery = "INSERT IGNORE INTO bitmapdepartment VALUES(" + "'" + empNo + "'" + ",'0','0','0','0','0','0','0','0','0')";
                stmt.addBatch(sqlQuery);
                if (empNo % 10000 == 0) {
                    result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows inserted in bitmapdepartment : " + result.length);
                }
            }
            stmt = conn.createStatement();
            sqlQuery = "SELECT * FROM employee_department";
            rs = stmt.executeQuery(sqlQuery);
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            while (rs.next()) {
                empNo = rs.getInt("emp_no");
                for (int i = 0; i < arrBitmapDept.length; i++) {
                    arrBitmapDept[i] = 0;
                }
                deptNo = rs.getString("dept_no").split(",");
                for (String deptNumber : deptNo) {
                    for (int i = 2; i <= deptCount; i++) {
                        if (deptNumber.equalsIgnoreCase(metaData.getColumnLabel(i))) {
                            arrBitmapDept[i - 2] = 1;
                        }
                    }
                }
                sqlQuery = "UPDATE IGNORE bitmapdepartment SET d001 = " + arrBitmapDept[0] + ",d002 = " + arrBitmapDept[1] + ",d003 = " + arrBitmapDept[2] + ",d004 = " + arrBitmapDept[3] + ",d005 = " + arrBitmapDept[4] + ",d006 = " + arrBitmapDept[5] + ",d007 = " + arrBitmapDept[6] + ",d008 = " + arrBitmapDept[7] + ",d009 = " + arrBitmapDept[8] + " WHERE emp_no = " + "'" + empNo + "'";
                stmt.addBatch(sqlQuery);
                if (empNo % 10000 == 0) {
                    result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows updated in bitmapdepartment : " + result.length);
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException se) {
        }
    }

    private static void insertAndUpdateBitmapRating() {
        try {
            int arrBitmapRating[] = new int[3];
            int[] result;
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmtColumn = conn.createStatement();
            sqlQuery = "CREATE TABLE IF NOT EXISTS bitmaprating(emp_no INT NOT NULL UNIQUE , "
                    + "lessThan3_5 INT "
                    + ",equalTo3_5 INT ,"
                    + "greaterThan3_5 INT ,"
                    + "PRIMARY KEY (emp_no))";
            System.out.println(sqlQuery);
            stmt.executeUpdate(sqlQuery);
            sqlQuery = "select emp_no, rating from employee_department";
            rs = stmt.executeQuery(sqlQuery);
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            while (rs.next()) {
                empNo = rs.getInt("emp_no");
                sqlQuery = "INSERT IGNORE INTO bitmaprating VALUES(" + "'" + empNo + "'" + ",'0','0','0')";
                stmt.addBatch(sqlQuery);
                if (empNo % 10000 == 0) {
                    result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows inserted in bitmaprating : " + result.length);
                }
            }
            stmt = conn.createStatement();
            sqlQuery = "SELECT * FROM employee_department";
            rs = stmt.executeQuery(sqlQuery);
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            double rating;
            while (rs.next()) {
                empNo = rs.getInt("emp_no");
                for (int i = 0; i < arrBitmapRating.length; i++) {
                    arrBitmapRating[i] = 0;
                }
                rating = rs.getFloat("rating");
                if (rating < 3.5) {
                    arrBitmapRating[0] = 1;
                } else if (rating == 3.5) {
                    arrBitmapRating[1] = 1;
                } else if (rating > 3.5) {
                    arrBitmapRating[2] = 1;
                }
                sqlQuery = "UPDATE IGNORE bitmaprating SET lessThan3_5 = " + arrBitmapRating[0] + ",equalTo3_5 = " + arrBitmapRating[1] + ",greaterThan3_5 = " + arrBitmapRating[2] + " WHERE emp_no = " + "'" + empNo + "'";
                stmt.addBatch(sqlQuery);
                if (empNo % 10000 == 0) {
                    result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows updated in bitmaprating : " + result.length);
                }
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException se) {
        }
    }

    public static void main(String[] args) throws SQLException {
        //insertAndUpdateBitmapDepartment();
        //insertAndUpdateBitmapRating();
    }

}
