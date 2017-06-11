package com.redis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created By : Jemin
 * Date       : 6/11/17
 * Time       : 6:14 PM
 */
public class RedisClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RedisConfig.class);
        ctx.refresh();
        RedisService redisService = ctx.getBean(RedisService.class);
        redisService.set("J", "Jemin");
        System.out.println(redisService.get("J"));
    }
}
