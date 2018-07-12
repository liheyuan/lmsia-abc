package com.coder4.lmsia.abc.server.rocketmq.impl;

import com.coder4.lmsia.abc.constant.LmsiaAbcConstant;
import com.coder4.lmsia.abc.server.data.MyEvent;
import com.coder4.lmsia.abc.server.rocketmq.intf.MyEventHandler;
import com.qianmi.ms.starter.rocketmq.annotation.RocketMQMessageListener;
import com.qianmi.ms.starter.rocketmq.core.RocketMQListener;
import com.qianmi.ms.starter.rocketmq.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.coder4.lmsia.abc.server.data.Constant.TOCPIC;

/**
 * @author coder4
 */
@Service
@RocketMQMessageListener(topic = TOCPIC, consumerGroup = LmsiaAbcConstant.PROJECT_NAME)
public class MyEventHandlerImpl implements MyEventHandler, RocketMQListener<MyEvent> {

    private Logger LOG = LoggerFactory.getLogger(getClass());

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void send(MyEvent event) {
        rocketMQTemplate.convertAndSend(TOCPIC, event);
    }

    @Override
    public void onMessage(MyEvent message) {
        LOG.info("receive message, data = {}", message.getData());
    }
}