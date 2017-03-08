package com.ziyuan.channel;

import com.ziyuan.events.Electron;

/**
 * Channel
 *
 * @author ziyuan
 * @since 2017-03-08
 */
public interface Channel {

    /**
     * 发布事件
     *
     * @param source
     * @param electron
     */
    void publish(String source, Electron electron);

    /**
     * 直接处理
     */
    void handle();
}