package kr.ac.kopo.kkssmm.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example02Controller {
    @RequestMapping(value = "/exam02", method = RequestMethod.GET)
    public String requestMethod() {
        return "@RestController 연습 중입니다.";
    }
    // 일반적으로 많이 쓰는 방법은 아님
    @RequestMapping(value = "/exam03", method = RequestMethod.GET)
    public @ResponseBody String getMessage() {
        return "@RestController getMessage 연습";
    }
}