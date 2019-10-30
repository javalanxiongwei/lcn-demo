package cn.wolfcode.lcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
public class OrderServerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(OrderServerApplication.class,args);
    }
}
