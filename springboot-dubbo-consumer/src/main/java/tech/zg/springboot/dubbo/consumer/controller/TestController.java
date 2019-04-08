package tech.zg.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.springboot.dubbo.api.TestService;

/**
 * 测试接口类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return testService.getSomeThing();
    }
}
