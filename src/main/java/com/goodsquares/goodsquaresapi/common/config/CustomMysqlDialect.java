package com.goodsquares.goodsquaresapi.common.config;
import org.hibernate.dialect.MySQLDialect;

public class CustomMysqlDialect extends MySQLDialect {

    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
