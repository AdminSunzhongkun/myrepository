package com.fh.product.util;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * @一句话描述：
 * @作者        ：孙中坤
 * @邮箱        : 279983976@qq.com
 * @创建日期    ：2018年11月06日 18:52
 */
public class SendUtilSMS {


    public static String sendSMS(String url, Map<String,String> headmaps,Map<String,String> bodymaps) throws IOException {

        CloseableHttpClient httpclient =  HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);

        if(headmaps!=null&&headmaps.size()>0){
            Iterator<Map.Entry<String, String>> iterator = headmaps.entrySet().iterator();
            ArrayList<NameValuePair> nameValuePairs = new ArrayList<>();

            while(iterator.hasNext()){

                Map.Entry<String, String> next = iterator.next();
                String key = next.getKey();
                String value = next.getValue();

                httpPost.addHeader(key,value);
            }


        }


        if(bodymaps!=null&&bodymaps.size()>0){
            Iterator<Map.Entry<String, String>> iterator = bodymaps.entrySet().iterator();
            ArrayList<NameValuePair> nameValuePairs = new ArrayList<>();
            while(iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();
                String key = next.getKey();
                String value = next.getValue();
                BasicNameValuePair basicNameValuePair = new BasicNameValuePair(key, value);
                nameValuePairs.add(basicNameValuePair);
            }

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs,"utf-8"));
        }


        CloseableHttpResponse response = httpclient.execute(httpPost);


        String s = EntityUtils.toString(response.getEntity(), "utf-8");

        response.close();
        httpPost.releaseConnection();
        httpclient.close();

        return s;
    }

}
