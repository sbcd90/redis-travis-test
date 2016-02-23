package org.apache.flink;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class RedisTravis {
    public boolean redisConn() {
        try {
            Jedis jedis = new Jedis("127.0.0.1", 6379);
            jedis.ping();
        } catch (JedisConnectionException e) {
            return false;
        }
        return true;
    }
}