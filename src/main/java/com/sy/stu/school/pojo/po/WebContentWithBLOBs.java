package com.sy.stu.school.pojo.po;

public class WebContentWithBLOBs extends WebContent {
    private String con;

    private String content;

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con == null ? null : con.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}