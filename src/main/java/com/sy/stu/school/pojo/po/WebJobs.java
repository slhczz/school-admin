package com.sy.stu.school.pojo.po;

import java.util.Date;

public class WebJobs {
    private Integer id;

    private String title;

    private String depar;

    private String telper;

    private String men;

    private String money;

    private String address;

    private Integer viewcount;

    private Integer state;

    private Integer open;

    private Date addtime;

    private Integer sort;

    private Integer comment;

    private Integer recommend;

    private String colors;

    private Integer bid;

    private Integer sid;

    private Integer tid;

    private Integer fid;

    private Integer recyle;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar == null ? null : depar.trim();
    }

    public String getTelper() {
        return telper;
    }

    public void setTelper(String telper) {
        this.telper = telper == null ? null : telper.trim();
    }

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men == null ? null : men.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getRecyle() {
        return recyle;
    }

    public void setRecyle(Integer recyle) {
        this.recyle = recyle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}