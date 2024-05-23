package com.metacoding.v1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {


    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number){
        if(number == 1){ // info 로그
            log.info("<h1>number 값이 1로 요청했습니다.</h1>info 로그 #####################################");
        		return "<h1>number 값이 1로 요청했습니다.";
	}else if(number == -1){ // error 로그
            log.error(" <h1>number 값이 -1로 요청했습니다.</h1> #####################################");
        		return "<h1>number 값이 -1로 요청했습니다.";
	}else if(number == 0){ // warn 로그
            log.warn("<h1>number 값이 0로 요청했습니다.</h1> #####################################");
		return "<h1>나는 장여니야 안녕ㄴ안영ㄴ앟어니어리너리;ㅓㄴㅇ러</h1>";        
	}
        
        return "<h2>aaa aws v1</h2>";
    }
}
