package com.eiv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.DataSource;

import org.h2.jdbcx.JdbcDataSource;

/***
 * Conexión a base de datos con JDBC y la interfaz javax.sql.DataSource
 * Pasos para la conexion
 * 1. Se instancia un javax.sql.DataSource
 * 2. Se obtiene del datasource una conexion
 * 3. De la conexión Statement
 * 4. Del Statement se ejecuta una consulta SQL
 * 5. Los resultados de la consulta estan disponibles en ResultSet
 * 
 * @author diego.cairone
 *
 */
public class App1 {
    
    public static void main( String[] args ) {
        App1 app = new App1();
        app.run();
    }
    
    public void run() {
        
        try(Connection conn = getDataSource().getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nombre FROM provincias");
            Scanner scanner = new Scanner(System.in)) {
            
            org.h2.tools.Server.startWebServer(conn);
            
            while(rs.next()) {
                long id = rs.getLong("id");
                String nombre = rs.getString("nombre");
                
                System.out.println(
                        String.format("Provincia: [%s] %s", id, nombre));
            }
            
            scanner.next();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    
    public DataSource getDataSource() {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setUrl("jdbc:h2:mem:testdb;INIT=runscript from 'src/main/resources/import.sql'");
        ds.setUser("sa");
        return ds;
    }
}
