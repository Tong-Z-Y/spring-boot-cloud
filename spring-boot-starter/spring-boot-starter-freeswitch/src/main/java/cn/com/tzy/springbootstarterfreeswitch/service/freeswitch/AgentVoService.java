package cn.com.tzy.springbootstarterfreeswitch.service.freeswitch;

import cn.com.tzy.springbootstarterfreeswitch.model.fs.AgentVoInfo;
import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class AgentVoService {

    public abstract AgentVoInfo getAgentBySip(String sip);
    public abstract AgentVoInfo findAgentId(String id);
    public abstract void save(AgentVoInfo entity);
    public abstract void updateStatus(Long id, boolean b);


}
