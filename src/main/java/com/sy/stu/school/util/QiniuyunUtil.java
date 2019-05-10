package com.sy.stu.school.util;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

public class QiniuyunUtil {
    private static final String domain = "http://image.hm115.cn/";
    private static final String accessKey = "30lDNvVGr2FvjFNFFyOYzn_Ns5rAUwtdvxsTca9t";
    private static final String secretKey = "DXGin0-m86_qc6ykWk00zNsWExdj0H3JvtVEJGJS";
    private static final String bucket = "leolasimage";

    public static boolean upload(String realName, String realNameWithPath) {
        boolean result = true;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);

        System.out.println("realName:"+realName+" realNameWithPath:"+realNameWithPath);

        try {
            Response response = uploadManager.put(realNameWithPath, realName, upToken);
        } catch (QiniuException ex) {
            result = false;
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }

        return result;
    }
    public static String getDomain(){
        return domain;
    }
}
