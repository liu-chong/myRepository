package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.example.demo.dao.secondMapper"},sqlSessionFactoryRef = "secondSqlSessionFactory")
public class SecondDbConfig {
    private Logger logger = LoggerFactory.getLogger(SecondDbConfig.class);
    // 精确到 master 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.xbz.**.dao.master";
    private static final String MAPPER_LOCATION = "classpath*:mapper/second/*.xml";

//    @Value("${spring.datasource.url2}")
//    private String dbUrl;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.datasource.driverClassName}")
//    private String driverClassName;


    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource secondDataSource() {
        return DataSourceBuilder.create().build();
    }

//    @Bean(name="secondDataSource")   //声明其为Bean实例
////    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
//    public DataSource masterDataSource() {
//        DruidDataSource datasource = new DruidDataSource();
//
//        datasource.setUrl(this.dbUrl);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//        datasource.setDriverClassName(driverClassName);
//
//        return datasource;
//    }

//    @Bean(name="secondJdbcTemplate")
//    public JdbcTemplate secondJdbcTemplate(
//        @Qualifier("secondDataSource") DataSource dataSource){
//            return new JdbcTemplate(dataSource);
//    }


    @Bean(name = "secondTransactionManager")
//    @Primary
    public DataSourceTransactionManager secondTransactionManager() {
        return new DataSourceTransactionManager(secondDataSource());
    }

    @Bean(name = "secondSqlSessionFactory")
//    @Primary
    public SqlSessionFactory secondSqlSessionFactory(@Qualifier("secondDataSource") DataSource secondDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(secondDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SecondDbConfig.MAPPER_LOCATION));
        //mybatis 数据库字段与实体类属性驼峰映射配置
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sessionFactory.getObject();
    }

}
