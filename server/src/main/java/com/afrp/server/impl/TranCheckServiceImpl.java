package com.afrp.server.impl;

import com.afrp.api.TranCheckService;
import com.afrp.api.in.TranCheckIn;
import com.afrp.api.out.TranCheckOut;
import com.afrp.base.model.generator.AfRule;
import com.afrp.server.common.service.AfRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("TranCheckService")
public class TranCheckServiceImpl implements TranCheckService {

    @Autowired
    private AfRuleService afRuleService;

    public TranCheckOut checkRule(TranCheckIn tranCheckIn) {
        List<AfRule> list = afRuleService.getAllAfRule();
        log.info("list!");
        return null;
    }
}
