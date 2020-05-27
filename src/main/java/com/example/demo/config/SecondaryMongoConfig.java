//package com.example.demo.config;
//
//import com.example.demo.config.AbstractMongoConfig;
//import com.mongodb.MongoClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
//public class SecondaryMongoConfig  extends AbstractMongoConfig {
//
////    @Value("spring.data.mongodb.secondary.host")
//    protected String host = "192.168.1.46";
////    @Value("spring.data.mongodb.secondary.port")
//    protected Integer port = 27017;
////    @Value("spring.data.mongodb.secondary.database")
//    protected String database = "dossier";
//
//    @Override
//    public MongoDbFactory mongoDbFactory(){
//        return new SimpleMongoDbFactory(new MongoClient(host, port), database);
//    }
//
//    @Primary
//    @Bean(name="SecondaryMongoConfig")
//    @Override
//    public MongoTemplate getMongoTemplate() {
//        return new MongoTemplate(mongoDbFactory());
//    }
//
//}
