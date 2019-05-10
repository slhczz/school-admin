package com.sy.stu.school.pojo.po;

public class WebGbookWithBLOBs extends WebGbook {
    private String content;

    private String replay;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        this.replay = replay == null ? null : replay.trim();
    }
}