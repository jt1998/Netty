package com.netty.netty.handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 姜涛
 * @create 2022-01-17 16:34
 */
@Component
public class ChildHandler extends ChannelInitializer<SocketChannel> {
    @Autowired
    private NettyHandler nettyHandler;
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(nettyHandler);
        System.out.println("增加netty实现服务handler...");
    }
}
