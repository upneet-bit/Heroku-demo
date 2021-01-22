package com.example.Backend1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    DB db = new DB();

    @GetMapping("/hello")
    public  String sayhello(){
        return "Hello Coders!! 1st API";
    }

    @GetMapping("/convert")
    public Integer convert(@RequestParam int q){
        int usd= q;
        return 74 * usd;
    }
    /////http:....../search?
    @GetMapping("/search")         ///as query param
    public String searchAword(@RequestParam String q){
        return db.search(q);
    }

}
