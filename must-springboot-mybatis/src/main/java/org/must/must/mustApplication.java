package org.must.must;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
@MapperScan("org.must.must.mapper")
public class mustApplication{

    public static void main(String[] args) {
        SpringApplication.run(mustApplication.class, args);
        log.info("==========strat=========="); 
    }

}
