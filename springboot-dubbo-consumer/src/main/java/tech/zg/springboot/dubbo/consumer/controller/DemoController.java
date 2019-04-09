package tech.zg.springboot.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.springboot.dubbo.api.DemoService;

/**
 * 测试接口类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "1.0")
    private DemoService testService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return testService.sayHello(name);
    }
}
