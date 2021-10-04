package dk.kea.adventureproject.repositories;

import dk.kea.adventureproject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * @author Julius Panduro
 */
public class ProductRepository {
    @Autowired
    JdbcTemplate template;
    //Template for ProductRepository

    public List<Product> fetchAll(){
        String sql = "SELECT * FROM products";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql, rowMapper);
    }
}