package org.apache.flink;

import org.junit.Assert;
import org.junit.Test;

public class RedisTravisTest {

    @Test
    public void redisConnTest() {
        RedisTravis rt = new RedisTravis();
        Assert.assertEquals(true, rt.redisConn());
    }
}