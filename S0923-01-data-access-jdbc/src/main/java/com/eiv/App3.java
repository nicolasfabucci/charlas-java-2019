package com.eiv;

import java.util.List;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Igual que en el ejemplo 1 pero con el objeto JdbcTemplate y la interfaz RowMapper
 * se puede transformar el resultado de una consulta en una coleccion de objetos
 * 
 * @author diego.cairone
 *
 */
public class App3 {

    public static void main(String[] args) {
        App3 app = new App3();
        app.run();
    }

    public void run() {
        
        JdbcTemplate template = new JdbcTemplate(getDataSource());
        
        List<ProvinciaEntity> provinciaEntities = template.query("SELECT * FROM provincias", (rs, row) -> {
            long id = rs.getLong("id");
            String nombre = rs.getString("nombre");
            ProvinciaEntity provincia = new ProvinciaEntity(id, nombre);
            return provincia;
        });
        
        provinciaEntities.forEach(provinciaEntity -> {
            System.out.println("Provincia: " + provinciaEntity);
        });
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
