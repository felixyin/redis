package com.qtrj;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;

public class AppTest {
    static Jedis jedis;

    @BeforeAll
    public static void initJedis() {
        jedis = new Jedis("127.0.0.1", 7000);
    }

    @Test
    public void testInsert() {
        jedis.set("name", "张三");
        assertTrue("张三".equals(jedis.get("name")));
    }

    @Test
    public void testDel() {
        jedis.del("name");
        assertTrue(null == jedis.get("name"));
    }
}
