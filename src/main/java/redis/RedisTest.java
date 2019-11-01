package redis;

import redis.clients.jedis.Jedis;

/**
 * author : zhouzijing
 * Date: 2019/10/29 17:43
 */
public class RedisTest {

    public static void main(String args[]){
        Jedis jedis = new Jedis("localhost", 6379, 100000);
        jedis.select(1);
        int i = 0;
        try{
            long start = System.currentTimeMillis();
            while (true){
                long end = System.currentTimeMillis();
                if (end - start >= 1000){
                    break;
                }
                i++;
                jedis.set("test"+ i, i + "");

            }
        }finally {
            jedis.close();
        }
        System.out.println(jedis.get("111"));
        System.out.println("redis每秒操作" + i +"次");

        System.out.println(3.14D);

    }


}
