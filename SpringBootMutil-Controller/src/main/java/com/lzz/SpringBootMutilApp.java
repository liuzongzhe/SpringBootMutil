package com.lzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author lzz
 * Date   2018/5/23
 */
@RestController
@MapperScan("com.lzz.mapper")
@SpringBootApplication
public class SpringBootMutilApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMutilApp.class, args);
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public Map<String, Object> showIndex() {
        Map<String, Object> map = new HashMap<>();
        map.put("Project", "SpringBootMutil");
        map.put("Author", "lzz");
        map.put("Date", "2018-05-23");
        return map;
    }
}