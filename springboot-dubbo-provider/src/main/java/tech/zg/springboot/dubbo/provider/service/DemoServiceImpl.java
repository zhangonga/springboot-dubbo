package tech.zg.springboot.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import tech.zg.springboot.dubbo.api.DemoService;

/**
 * 提供服务类
 * <p>
 *
 * @author: 张弓
 * @date: 2019/4/8
 * @version: 1.0.0
 */
@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    /**
     * 测试服务
     * <p>
     *
     * @param name
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
