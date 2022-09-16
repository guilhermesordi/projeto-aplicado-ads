package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static Connection con;
    
//    public static void main(String args[]) {
//    	getConnection();
//    	
//    }
    
    public static Connection getConnection(){
        try { 
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            con = DriverManager.getConnection(url,"postgres","159");
            con.setAutoCommit(true);
            System.out.println("Banco ligado com sucesso");
            return con;      
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Erro ao ligar com o banco: " + e);
        } catch (SQLException se){
            se.printStackTrace();
            System.out.println("Erro ao ligar com o banco " + se);
        }
        return null;
    }
    
    public static void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}