//package com.example.demo.service.Impl;
//
//import com.example.demo.model.Form;
//import com.example.demo.model.FormLogicInfoVO;
//import com.example.demo.model.Template;
//import com.example.demo.service.ISearchTemplate;
//import com.mongodb.MongoClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Service;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Set;
//@Service
//public class TemplateImpl implements ISearchTemplate {
//
//    @Autowired
//    MongoTemplate template;
//
//    @Override
//    public String searchTemplate(String templateId) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("_id").is(templateId).and("deleted").is(false));
//        Set<String> set = template.getCollectionNames();
//        Template templateResult = template.findOne(query,Template.class,"template");
//
//        try{
//            String host = "192.168.1.46";
//            Integer port = 27017;
//            String database = "dossier";
//            MongoDbFactory  mongoDbFactory = new SimpleMongoDbFactory(new MongoClient(host, port), database);
//            MongoTemplate second = new MongoTemplate(mongoDbFactory);
//
//            if(templateResult != null) {
//                     LinkedHashMap<String , String> forms = templateResult.getFormList();
//                     if(forms.size() > 0){
//                         Set<Map.Entry<String, String>> entrySet = forms.entrySet();
//    //                    /**连接到 mongodb 服务*/
//    //                    MongoClient mongoClient = new MongoClient( "192.168.1.46" , 27017 );
//    //                    MongoClientURI uri = new MongoClientURI("mongodb://192.168.1.46:27017/dossier");
//    //                    MongoClient client = new MongoClient(uri);
//
//    //                    /**连接到数据库*/
//    //                    MongoDatabase mongoDatabase = mongoClient.getDatabase("dossier");
//    //                    MongoCollection<Document>  form = mongoDatabase.getCollection("form");
//                        int count = 1;
//                        for(Map.Entry<String, String> entry:entrySet){
//                            Query query1 = new Query();
//                            query1.addCriteria(Criteria.where("_id").is(entry.getValue()));
//                            Form formResult = template.findOne(query1,Form.class,"form");
//                            FormLogicInfoVO formLogicInfoVO = template.findOne(query1,FormLogicInfoVO.class,"formLogicInfo");
//
//                            if(formResult != null){
//                                second.save(formResult,"form");
//
//                                if(formLogicInfoVO != null){
//                                    second.save(formLogicInfoVO,"formLogicInfo");
//                                    System.out.println(formResult.getId());
//                                }
//                                System.out.println(formResult.getId());
//                                System.out.println(count);
//                                count ++ ;
//                            }
//                        }
//                        second.save(templateResult,"template");
//                        System.out.println("+++++++++++++"+ templateId);
//                }
//            }
//        }catch(Exception e){
//            System.err.println("连接失败");
//        }
//        return "1";
//    }
//
//}
