package cn.luoshi.filter;

import com.dtk.util.HttpUtils;
import com.dtk.util.SignMD5Util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @projectName:dtk-items-openapi
 * @createTime: 2019/04/19 13:40
 * @description:
 */
public class Demo {
    private static final String appSecret = "b94fd7405747ca971f22f0f0ed4b37fb";//应用sercret
    private static final String appKey = "5db14111720ce"; //应用key
    private static final String host = "https://openapi.dataoke.com/api/goods/get-goods-details";//应用服务接口
    public static void main(String[] args) {
        TreeMap<String,String> paraMap = new TreeMap<>();
 
        paraMap.put("version","v1.0.0");
        paraMap.put("appKey","5db14111720ce");
        paraMap.put("goodsId","603126521513");
        paraMap.put("sign", SignMD5Util.getSignStr(paraMap,appSecret));
        System.out.println(SignMD5Util.getSignStr(paraMap,appSecret));
        System.out.println(host);
        System.out.println(paraMap);
        String string = HttpUtils.sendGet(host,paraMap);
        System.out.println(string);
    }
}
