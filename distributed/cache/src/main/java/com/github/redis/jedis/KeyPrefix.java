package com.github.redis.jedis;

/**
 * @author hangs.zhang
 * @date 2018-01-29 22:07
 * *****************
 * function: 模板方法模式
 *
 * interface -> abstract -> class
 */
public interface KeyPrefix {

    /**
     * 过期时间设置
     */
    int expireSeconds();

    /**
     * key的前缀
     */
    String getPrefix();

}
