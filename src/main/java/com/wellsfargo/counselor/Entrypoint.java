package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.Advisor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }
//        Advisor fa = new Advisor("Jamie", "James","San Fernando", "302-9966", "james@gmail.com");
//        System.out.println(fa.getFirstName());
}
