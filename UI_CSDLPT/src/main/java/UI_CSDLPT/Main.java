/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CSDLPT;

import java.awt.Button;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baobo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Connection connect = null;

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        LoginFrame m = new LoginFrame();
        try {
            //Button btn = new Button();
            selectedServer("Server 1");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
    }

    static void  selectedServer(String server) throws SQLException {
        System.out.println(server); // TODO Auto-generated catch block
        switch (server) {
            case "Server 1":
                Connection conn1 = connect("45678");
                connect = conn1;
                break;
            case "Server 2":
                System.out.println();
                Connection conn2 = connect("45679");
                connect = conn2;
                break;
            case "Server 3":
                Connection conn3 = connect("45670");
                connect = conn3;
                break;
            case "Server4":
                Connection conn4 = connect("45671");
                connect = conn4;
                break;
                
            default:
                break;
        }
    }
        public static Connection connect(String port) throws SQLException {
//		String dbURL = "jdbc:sqlserver://localhost:+" + port + ";databaseName=DANGKYTOUR;user=sa;password=root";

        String dbURL = null;
        
        if(Integer.parseInt(port) == 45678) {
            dbURL = "jdbc:sqlserver://localhost:"+port+";databaseName=KanBos;user=sa;password=as" ;
        }else if(Integer.parseInt(port) == 456789) {
            
            dbURL = "jdbc:sqlserver://localhost:" + port + ";databaseName=KanBos;user=sa;password=as";
            System.out.println(dbURL);
            
        }else if(Integer.parseInt(port) == 45670) {
            dbURL = "jdbc:sqlserver://localhost:" + port + ";databaseName=KanBos;user=sa;password=as";
        }
        else if(Integer.parseInt(port) == 45671) {
            dbURL = "jdbc:sqlserver://localhost:" + port + ";databaseName=KanBos;user=sa;password=as";
        }

        Connection conn = null;
        conn = DriverManager.getConnection(dbURL);

        DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
        //System.out.println("Product name: " + dm.getURL());

        return conn;
    }
}
