package zero.contentcalender.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContentJDBCRTemplateRepository {
    private final JdbcTemplate jdbcTemplate;

    public ContentJDBCRTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
