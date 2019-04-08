package com.goodsquares.goodsquaresapi.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Value(value = "${MYSQL_HOST:localhost}")
    private String host;

    @Value(value = "${MYSQL_USER:squares}")
    private String user;

    @Value(value = "${MYSQL_PORT:3306}")
    private String port;

    @Value(value = "${MYSQL_PASSWORD:squares}")
    private String password;

    @Value(value = "${MYSQL_DATABASE:squares}")
    private String database;

    @Bean
    @Primary
    @Profile("prod")
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username(user)
                .password(password)
                .url("jdbc:mysql://"+ host +":" + port+"/"+database+"?verifyServerCertificate=false&useSSL=false&requireSSL=false")
                .build();
    }

}
