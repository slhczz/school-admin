package com.sy.stu.school.util;

import java.util.ArrayList;
import java.util.List;

public class BeanUtils {
    public static <T> List<T> copyProperties(List source,Class<T> tClass) throws Exception {
        List<T> list = new ArrayList<>();
        for (Object o : source) {
            T t = tClass.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(o,t);
            list.add(t);
        }
        return list;
    }
}
