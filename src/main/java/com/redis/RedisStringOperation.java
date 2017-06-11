package com.redis;

/**
 * Created By : Jemin
 * Date       : 6/11/17
 * Time       : 6:11 PM
 */
public interface RedisStringOperation {

    void set(String key, String value);

    Object get(String key);
}
