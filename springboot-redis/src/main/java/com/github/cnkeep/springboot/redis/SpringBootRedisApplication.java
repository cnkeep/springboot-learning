package com.github.cnkeep.springboot.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Semaphore;

/**
 * 描述~
 *
 * @author <a href="zhangleili924@gmail.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date ${DATE}
 */
@SpringBootApplication
public class SpringBootRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisApplication.class, args);
        Semaphore semaphore = new Semaphore(0);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

