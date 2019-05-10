package com.sy.stu.school.pojo.po;

import java.util.Date;

public class WebOrder {
    private Integer id;

    private String name;

    private String song;

    private String pro;

    private String city;

    private String tel;

    private String zip;

    private String company;

    private String address;

    private String email;

    private Date addtime;

    private String proname;

    private String proprice;

    private String procount;

    private String getid;

    private Integer bid;

    private Integer sid;

    private Integer tid;

    private Integer fid;

    private String xian;

    private Integer checks;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song == null ? null : song.trim();
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro == null ? null : pro.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProprice() {
        return proprice;
    }

    public void setProprice(String proprice) {
        this.proprice = proprice == null ? null : proprice.trim();
    }

    public String getProcount() {
        return procount;
    }

    public void setProcount(String procount) {
        this.procount = procount == null ? null : procount.trim();
    }

    public String getGetid() {
        return getid;
    }

    public void setGetid(String getid) {
        this.getid = getid == null ? null : getid.trim();
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

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian == null ? null : xian.trim();
    }

    public Integer getChecks() {
        return checks;
    }

    public void setChecks(Integer checks) {
        this.checks = checks;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}