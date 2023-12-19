package com.pluralsight.NorthwindTradersSpringBoot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatasourceConfig {
    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String myDbUsername;

    @Value("${spring.datasource.password}")
    private String myDbPassword;

    @Bean
    public DataSource dataSource() throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(myDbUsername);
        dataSource.setPassword(myDbPassword);
        return dataSource;
    }


}
