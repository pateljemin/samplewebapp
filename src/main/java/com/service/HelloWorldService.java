package com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created By : Jemin
 * Date       : 4/17/17
 * Time       : 10:15 AM
 */
@Service
public class HelloWorldService {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

    public String getDesc() {
        logger.debug("Hello World service GetDesc");

        return "I am Hello World Service";
    }

    public String getTitle(String name) {

        logger.debug("In Get Title");

        if (StringUtils.isEmpty(name)) {
            return "Hello Jemin";
        } else {
            return "Hello" + name;
        }
    }
}
