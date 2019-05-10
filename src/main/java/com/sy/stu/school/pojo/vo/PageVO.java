package com.sy.stu.school.pojo.vo;

import lombok.Data;

@Data
public class PageVO {
    private Integer page = 1;
    private Integer size = 10;

    public Integer getOffset() {
        return (page - 1) * size;
    }

}
