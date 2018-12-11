package BitmapMajorProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateEmployeeTable {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/employees";
    static final String USER = "root";
    static final String PASS = "root";

    static ResultSet rs = null;
    static Statement stmt = null;
    static Connection conn = null;
    static String sqlQuery = null;

    static String getPhoneNumber() {
        int num1, num2, num3;
        int set2, set3;
        Random generator = new Random();
        num1 = generator.nextInt(7) + 1;
        num2 = generator.nextInt(8);
        num3 = generator.nextInt(8);
        set2 = generator.nextInt(643) + 100;
        set3 = generator.nextInt(8999) + 1000;
        //System.out.println("(" + num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3);
        return num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
    }

    static void insertInEmployeeContact() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            sqlQuery = "CREATE TABLE IF NOT EXISTS employee_contact(emp_no_contact INT NOT NULL UNIQUE , "
                    + "rating double ,"
                    + "phonenumber varchar(15) ,"
                    + "emailid varchar(30) ,"
                    + "educationlevel varchar(15) ,"
                    + "mothertongue varchar(20) ,"
                    + "PRIMARY KEY (emp_no_contact))";
            System.out.println(sqlQuery);
            stmt.executeUpdate(sqlQuery);
            sqlQuery = "select emp_no, first_name, last_name, rating from employee_department";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            int emp_no;
            String phonenumber = "", emailid = "";
            ArrayList<String> educationlevel = new ArrayList<>();
            educationlevel.add("B.Tech");
            educationlevel.add("B.Com");
            educationlevel.add("MBA");
            educationlevel.add("M.Tech");
            ArrayList<String> mothertongue = new ArrayList<>();
            mothertongue.add("Telugu");
            mothertongue.add("English");
            mothertongue.add("Hindi");
            mothertongue.add("Japanese");
            mothertongue.add("French");
            mothertongue.add("Korean");
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            double rating = 0.0;
            while (rs.next()) {
                rating = rs.getDouble("rating");
                emp_no = rs.getInt("emp_no");
                emailid = rs.getString("first_name") + "." + rs.getString("last_name") + "@gmail.com";
                phonenumber = UpdateEmployeeTable.getPhoneNumber();
                sqlQuery = "INSERT IGNORE INTO employee_contact VALUES(" + "'" + emp_no + "','" + rating + "','" + phonenumber + "','" + emailid + "','" + educationlevel.get(emp_no % educationlevel.size()) + "','" + mothertongue.get(emp_no % mothertongue.size()) + "')";
                stmt.addBatch(sqlQuery);
                if (emp_no % 10000 == 0) {
                    int[] result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows inserted in employee_contact : " + result.length);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void insertInEmployeeBenefits() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            sqlQuery = "CREATE TABLE IF NOT EXISTS employee_benefits(emp_no_benefits INT NOT NULL UNIQUE , "
                    + "rating DOUBLE ,"
                    + "salary DOUBLE ,"
                    + "hike DOUBLE(2,1) ,"
                    + "benefits varchar(50) ,"
                    + "status varchar(20) ,"
                    + "PRIMARY KEY (emp_no))";
            System.out.println(sqlQuery);
            stmt.executeUpdate(sqlQuery);
            sqlQuery = "SELECT emp_no, rating FROM employee_department";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            Random rd = new Random();
            int emp_no, salary;
            double hike, rating;
            String benefits = null;
            String[] status = new String[3];
            status[0] = "Intern";
            status[1] = "Part Time";
            status[2] = "Full Time";
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            while (rs.next()) {
                salary = rd.nextInt(1000000);
                salary = salary < 0 ? -salary : salary;
                hike = rd.nextDouble() * 10.0;
                hike = hike < 0 ? -hike : hike;
                rating = rs.getDouble("rating");
                emp_no = rs.getInt("emp_no");
                if (rating < 3.5) {
                    benefits = "Employee Discount";
                } else if (rating == 3.5) {
                    benefits = "Insurance Policy";
                } else {
                    benefits = "Car Loan";
                }
                sqlQuery = "INSERT IGNORE INTO employeebenefits VALUES(" + "'" + emp_no + "','" + rating + "','" + salary + "','" + hike + "','" + benefits + "','" + status[emp_no % 3] + "')";
                stmt.addBatch(sqlQuery);
                if (emp_no % 10000 == 0) {
                    int[] result = stmt.executeBatch();
                    conn.commit();
                    System.out.println("The number of rows inserted in employeebenefits : " + result.length);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void insertIntoEmployeeDepartment() {
        FileReader fr = null;
        try {
            int i = 1;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String line = null;
            String arrRow[];
            File file = new File("Employees.txt");
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            while ((line = br.readLine()) != null && (i + 332431) <= 500000) {
                arrRow = line.split("#");
                sqlQuery = "INSERT IGNORE INTO employee_department VALUES(" + "'" + arrRow[0] + "','" + arrRow[1] + "','" + arrRow[2] + "','" + arrRow[3] + "','" + arrRow[4] + "','" + arrRow[5] + "','" + arrRow[6] + "','" + (i + 332431) + "','" + arrRow[8] + "','" + arrRow[9] + "'" + ")";
                stmt.addBatch(sqlQuery);
                if ((i + 332431) % 1000 == 0) {
                    int result[] = stmt.executeBatch();
                    conn.commit();
                    System.out.println("No of rows returned = " + result.length);
                }
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(UpdateEmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) {
        //UpdateEmployeeTable.insertIntoEmployeeDepartment();
        UpdateEmployeeTable.insertInEmployeeContact();
        //UpdateEmployeeTable.insertInEmployeeBenefits();
    }
}
