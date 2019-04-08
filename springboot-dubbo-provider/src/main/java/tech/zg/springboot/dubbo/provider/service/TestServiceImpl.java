package tech.zg.springboot.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import tech.zg.springboot.dubbo.api.TestService;

/**
 * 提供服务类
 * <p>
 *
 * @author: 张弓
 * @date: 2019/4/8
 * @version: 1.0.0
 */
@Component
@Service
public class TestServiceImpl implements TestService {

    /**
     * 读取一些消息
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    @Override
    public String getSomeThing() {
        return "hello dubbo";
    }
}
