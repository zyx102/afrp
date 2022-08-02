package com.afrp.base.model.generator;

import javax.persistence.*;

@Table(name = "af_rule")
public class AfRule {
    @Id
    private String ruleno;

    private String rulename;

    /**
     * 排序号
     */
    private String soltno;

    /**
     * 规则集
     */
    private String rulegroup;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 事件
     */
    private String eventid;

    /**
     * 是否开启
     */
    private String isinuse;

    /**
     * 命中后处置
     */
    private String decision;

    /**
     * @return ruleno
     */
    public String getRuleno() {
        return ruleno;
    }

    /**
     * @param ruleno
     */
    public void setRuleno(String ruleno) {
        this.ruleno = ruleno;
    }

    /**
     * @return rulename
     */
    public String getRulename() {
        return rulename;
    }

    /**
     * @param rulename
     */
    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    /**
     * 获取排序号
     *
     * @return soltno - 排序号
     */
    public String getSoltno() {
        return soltno;
    }

    /**
     * 设置排序号
     *
     * @param soltno 排序号
     */
    public void setSoltno(String soltno) {
        this.soltno = soltno;
    }

    /**
     * 获取规则集
     *
     * @return rulegroup - 规则集
     */
    public String getRulegroup() {
        return rulegroup;
    }

    /**
     * 设置规则集
     *
     * @param rulegroup 规则集
     */
    public void setRulegroup(String rulegroup) {
        this.rulegroup = rulegroup;
    }

    /**
     * 获取渠道
     *
     * @return channel - 渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置渠道
     *
     * @param channel 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取事件
     *
     * @return eventid - 事件
     */
    public String getEventid() {
        return eventid;
    }

    /**
     * 设置事件
     *
     * @param eventid 事件
     */
    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    /**
     * 获取是否开启
     *
     * @return isinuse - 是否开启
     */
    public String getIsinuse() {
        return isinuse;
    }

    /**
     * 设置是否开启
     *
     * @param isinuse 是否开启
     */
    public void setIsinuse(String isinuse) {
        this.isinuse = isinuse;
    }

    /**
     * 获取命中后处置
     *
     * @return decision - 命中后处置
     */
    public String getDecision() {
        return decision;
    }

    /**
     * 设置命中后处置
     *
     * @param decision 命中后处置
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }
}