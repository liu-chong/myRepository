//package com.example.demo.config;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import lombok.Data;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
//import com.mongodb.MongoClient;
//import com.mongodb.MongoCredential;
//import com.mongodb.ServerAddress;
//
//@Data
//public abstract class AbstractMongoConfig{
//        protected String host;
//        protected int port;
//        protected String username;
//        protected String password;
//        protected String database;
//        public MongoDbFactory mongoDbFactory(){
//            ServerAddress serverAddress = new ServerAddress(host, port);
//            List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
//            credentialsList.add(MongoCredential.createMongoCRCredential(username, database , password.toCharArray()));
//            return new SimpleMongoDbFactory(new MongoClient(serverAddress, credentialsList),database);
//        }
//        public abstract MongoTemplate getMongoTemplate();
//}

