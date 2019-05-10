package com.sy.stu.school.pojo.po;

import java.util.Date;

public class WebContent {
    private Integer id;

    private String title;

    private String colors;

    private String pic;

    private Integer viewcount;

    private Integer state;

    private Integer open;

    private Date addtime;

    private Integer showpic;

    private Integer showstr;

    private Integer bid;

    private Integer sid;

    private Integer tid;

    private Integer fid;

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

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
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

    public Integer getShowpic() {
        return showpic;
    }

    public void setShowpic(Integer showpic) {
        this.showpic = showpic;
    }

    public Integer getShowstr() {
        return showstr;
    }

    public void setShowstr(Integer showstr) {
        this.showstr = showstr;
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
}