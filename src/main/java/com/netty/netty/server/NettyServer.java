package com.netty.netty.server;

import com.netty.netty.handler.ChildHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 姜涛
 * @create 2022-01-17 16:31
 */
/*netty服务端*/
@Component
public class NettyServer {
    @Autowired
    private ChildHandler childHandler;

    /*服务端实现*/
    public void run(int port) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        System.out.println("此次监听的端口是  " + port);
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG,128)
                    .childHandler(childHandler);
            /*绑定端口*/
            ChannelFuture cf = bootstrap.bind(port).sync();
            /*等待服务监听端口关闭*/
            cf.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            /*退出，释放线程资源*/
            if (bossGroup != null){
                bossGroup.shutdownGracefully();
            }
            if (workerGroup != null){
                workerGroup.shutdownGracefully();
            }
        }
    }


}
