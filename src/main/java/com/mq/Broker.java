package com.mq;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author : yyc
 * @date : 2019-11-11
 */
public class Broker {

    private final static int MAX_SIZE = 3;

    private static ArrayBlockingQueue<String> mq = new ArrayBlockingQueue<String>(MAX_SIZE);

    public void produce(String msg) {

        if(mq.offer(msg)) {

            System.out.println("消息投递成功：" + msg + "当前在暂存消息数量为：" + mq.size());

        } else {

            System.out.println("消息中心暂存消息达到上限，不能继续放入消息");
        }
        System.out.println("================================");
    }


}
