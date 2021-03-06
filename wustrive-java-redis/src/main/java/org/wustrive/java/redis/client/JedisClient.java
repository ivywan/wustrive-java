package org.wustrive.java.redis.client;

import org.wustrive.java.redis.pool.RedisPools;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Description: TODO
 * @author wubaoguo
 * @mail: wustrive2008@gmail.com
 * @date: 2017年3月11日 下午4:08:26
 * @version: v0.0.1
 */
public class JedisClient {
    
    private JedisPool pool;
    
    
    protected JedisClient(String configFilePath){
        pool = RedisPools.getInstance().getPool(configFilePath);
    }
    
    /**
     * 获取jedis实例
     * @return
     */
    public Jedis getJedis(){
        return pool.getResource();
    }
    
    public void close(Jedis resource) {
    	resource.close();
    }
}
