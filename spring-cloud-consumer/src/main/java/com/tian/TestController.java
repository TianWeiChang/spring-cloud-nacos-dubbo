package com.tian;


import com.tian.service.GoodsService;
import com.tian.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class TestController {

    @Reference
    private UserService userService;
    /*@Reference
    private GoodsService goodsService;*/

    @GetMapping("/test")
    public String call() {
        return userService.sayHello("tian");
    }
}
