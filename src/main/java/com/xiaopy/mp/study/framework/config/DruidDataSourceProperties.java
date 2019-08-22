package com.xiaopy.mp.study.framework.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiaopeiyu
 * @since 2019/8/21
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSourceProperties {

    // jdbc
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    // jdbc connection pool
    private int initialSize;
    private int minIdle;
    private int maxActive = 100;
    private long maxWait;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    // filter
    private String filters;



}
