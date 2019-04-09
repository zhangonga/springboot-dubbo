package tech.zg.springboot.dubbo.api;

/**
 * Demo类API
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
public interface DemoService {

    /**
     * 测试服务
     * <p>
     *
     * @param name
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    String sayHello(String name);
}
