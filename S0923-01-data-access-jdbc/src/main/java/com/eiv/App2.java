package com.eiv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/***
 * Pool de conexiones con HikariCP
 * 
 * @author diego.cairone
 */
public class App2 {

    public static void main(String[] args) {
        App2 app = new App2();
        app.run();
    }
    
    public void run() {

        try(Connection conn = getDataSource().getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, nombre FROM provincias");
            Scanner scanner = new Scanner(System.in)) {
            
            org.h2.tools.Server.main();
            
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
        
        HikariConfig cfg = new HikariConfig();
        cfg.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
        cfg.setJdbcUrl("jdbc:h2:mem:testdb;INIT=runscript from 'src/main/resources/import.sql'");
        cfg.setUsername("sa");
        
        HikariDataSource ds = new HikariDataSource(cfg);
        
        return ds;
    }
}
