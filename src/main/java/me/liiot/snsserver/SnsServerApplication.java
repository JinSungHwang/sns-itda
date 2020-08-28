package me.liiot.snsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SnsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnsServerApplication.class, args);
    }

}
