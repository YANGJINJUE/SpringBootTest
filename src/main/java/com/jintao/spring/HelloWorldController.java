package com.jintao.spring;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * controller
 *
 * @author yangjinjue
 * @version 1.0
 * @since 2017/9/16
 */
/**
 * Spring Boot HelloWorld案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/")
    public String sayHello() {
        logger.info("SpringBoot被调用");
        return "Hello,World!";
    }
}
