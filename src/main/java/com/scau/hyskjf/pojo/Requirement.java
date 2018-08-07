package com.scau.hyskjf.pojo;

import java.util.Date;

public class Requirement {
    private Integer reqid;

    private Long memid;

    private String reqinfo;

    private Date reqtime;

    private Long reqby;

    private Boolean reqreply;

    private String reqrepcontent;

    private Integer reqrepby;

    private Date reqreptime;

    public Integer getReqid() {
        return reqid;
    }

    public void setReqid(Integer reqid) {
        this.reqid = reqid;
    }

    public Long getMemid() {
        return memid;
    }

    public void setMemid(Long memid) {
        this.memid = memid;
    }

    public String getReqinfo() {
        return reqinfo;
    }

    public void setReqinfo(String reqinfo) {
        this.reqinfo = reqinfo;
    }

    public Date getReqtime() {
        return reqtime;
    }

    public void setReqtime(Date reqtime) {
        this.reqtime = reqtime;
    }

    public Long getReqby() {
        return reqby;
    }

    public void setReqby(Long reqby) {
        this.reqby = reqby;
    }

    public Boolean getReqreply() {
        return reqreply;
    }

    public void setReqreply(Boolean reqreply) {
        this.reqreply = reqreply;
    }

    public String getReqrepcontent() {
        return reqrepcontent;
    }

    public void setReqrepcontent(String reqrepcontent) {
        this.reqrepcontent = reqrepcontent;
    }

    public Integer getReqrepby() {
        return reqrepby;
    }

    public void setReqrepby(Integer reqrepby) {
        this.reqrepby = reqrepby;
    }

    public Date getReqreptime() {
        return reqreptime;
    }

    public void setReqreptime(Date reqreptime) {
        this.reqreptime = reqreptime;
    }
}