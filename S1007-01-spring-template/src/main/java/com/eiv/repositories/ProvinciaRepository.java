package com.eiv.repositories;

import java.sql.Types;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameterValue;
import org.springframework.stereotype.Repository;

import com.eiv.entities.ProvinciaEntity;

@Repository
public class ProvinciaRepository implements CrudRepository<ProvinciaEntity, Long> {

    private static final String SQL_FIND_BY_ID = "SELECT * FROM provincias WHERE id = ?";
    
    private final RowMapper<ProvinciaEntity> rowMapper = (rs, row) -> {
        long id = rs.getLong("id");
        String nombre = rs.getString("nombre");
        return new ProvinciaEntity(id, nombre);
    };
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public ProvinciaRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public Optional<ProvinciaEntity> findById(Long id) {
        
        SqlParameterValue paramId = new SqlParameterValue(Types.INTEGER, id);
        
        ProvinciaEntity provinciaEntity = jdbcTemplate.queryForObject(
                SQL_FIND_BY_ID, rowMapper, paramId);
        
        if (provinciaEntity == null) {
            return Optional.empty();
        } else {
            return Optional.of(provinciaEntity);
        }
    }

    @Override
    public List<ProvinciaEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
