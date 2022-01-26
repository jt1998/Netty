package com.netty.netty.handler;
import com.netty.netty.service.NettyService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import io.netty.util.CharsetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 姜涛
 * @create 2022-01-17 16:32
 */
@Component
@ChannelHandler.Sharable
public class NettyHandler extends ChannelHandlerAdapter {

    @Autowired
    private NettyService nettyService;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ByteBuf byteBuf = (ByteBuf) msg;
            String data = byteBuf.toString(CharsetUtil.UTF_8);
            String message = nettyService.nettyTest(data);
            System.out.println(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
