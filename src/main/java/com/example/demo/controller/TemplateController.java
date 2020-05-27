package com.example.demo.controller;

import com.example.demo.response.WebResponse;
import com.example.demo.response.WebResponseUtils;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("import")
public class TemplateController {
//    @Autowired
//    ISearchTemplate searchTemplate;
    @Autowired
    IUserService userService;

//    @RequestMapping(value = "/importTemplate" ,method = RequestMethod.GET)
//    public WebResponse importTemplate(@RequestParam String templateId){
//        searchTemplate.searchTemplate(templateId);
//        return WebResponseUtils.successWebResponse(templateId);
//    }


    @RequestMapping(value = "/findUserById" ,method = RequestMethod.GET)
    public WebResponse findUserById(@RequestParam int id){
        return WebResponseUtils.successWebResponse( userService.findUserById(id));
    }


    @RequestMapping(value = "/getSecond" ,method = RequestMethod.GET)
    public WebResponse getSecond(@RequestParam Integer id){
        return WebResponseUtils.successWebResponse( userService.getSecond(id.longValue()));
    }


}
