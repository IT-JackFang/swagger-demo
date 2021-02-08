package com.fxz.swagger.demo.testcontroller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Fang
 * @date 2021-01-06 15:37:41
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试相关接口", description = "提供测试相关的Rest API")
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString().replace("-", "");
        System.out.println("str = " + str);
    }


}
