package com.netty.netty.service.impl;

import com.netty.netty.service.NettyService;
import org.springframework.stereotype.Service;

/**
 * @author 姜涛
 * @create 2022-01-17 16:50
 */
@Service
public class NettyServiceImpl implements NettyService {
    @Override
    public String nettyTest(String msg) {
        return "接收到数据  " + msg;
    }
}
