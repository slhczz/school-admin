package com.sy.stu.school.pojo.po;

public class WebProductWithBLOBs extends WebProduct {
    private String pic;

    private String content;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}