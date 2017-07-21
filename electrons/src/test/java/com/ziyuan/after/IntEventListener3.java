package com.ziyuan.after;

import com.ziyuan.ElectronsListener;

/**
 * IntEventListener3
 *
 * @author ziyuan
 * @since 2017-03-20
 */
//@Listener(id = "3", subscribe = "after")
//@Listener(id = "3", subscribe = "after", after = "1")
//@Listener(subscribe = "after", after = "1")
public class IntEventListener3 implements ElectronsListener<IntEvent> {

    @Override
    public void onEvent(IntEvent electrons) throws Exception {
        System.out.println("middle 2 id 3 after is doing..." + "----------" + electrons.getSource() + "\n");
    }
}
