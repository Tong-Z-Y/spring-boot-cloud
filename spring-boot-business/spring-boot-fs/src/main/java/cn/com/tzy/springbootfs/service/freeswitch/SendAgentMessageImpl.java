package cn.com.tzy.springbootfs.service.freeswitch;

import cn.com.tzy.springbootcomm.common.vo.RestResult;
import cn.com.tzy.springbootstarterfreeswitch.enums.fs.AgentStateEnum;
import cn.com.tzy.springbootstarterfreeswitch.model.fs.AgentVoInfo;
import cn.com.tzy.springbootstarterfreeswitch.model.notice.CallMessage;
import cn.com.tzy.springbootstarterfreeswitch.service.freeswitch.SendAgentMessage;
import org.springframework.stereotype.Service;

@Service
public class SendAgentMessageImpl implements SendAgentMessage {


    @Override
    public void sendMessage(AgentStateEnum agentStateEnum, AgentVoInfo agentVoInfo, CallMessage callMessage) {

    }

    @Override
    public void sendMessage(String namespace,String agentCommon,String agentCode, RestResult result) {

    }
}
