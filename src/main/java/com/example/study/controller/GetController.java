package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/api") //localhost:8080/api
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //localhost:8080/api/getMethod
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")  //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name="password") String pwd) {
        String password = "bbbbbbbb";
        System.out.println(id);
        System.out.println(password);

        return id+password;
    }

    //localhost:8080/api/multiParameter?account=abcd&email=sumin@naver.com&page=10
    @GetMapping("/multiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return searchParam;
    }

}
