/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author ASUS
 */
public class KoneksiDB {
    static Connection con;
    static String db_name = "sewabuku";
    static String db_user = "root";
    static String db_pass = "";
    
    public static Connection GetConnection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName(db_name);
            data.setUser(db_user);
            data.setPassword(db_pass);
            
            try{
                con = data.getConnection();
                System.out.println("Database connect");
            }
            catch(SQLException e){
                System.out.println("Database tidak connect");
            }
        }
                return con;
    }
}
