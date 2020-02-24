package com.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyThhpClient {
    @Test
    public void test1() throws IOException {
        String result;
        HttpGet get=new HttpGet("http://www.baidu.com");
        HttpClient httpClient=new DefaultHttpClient();
        HttpResponse response=httpClient.execute(get);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);


    }
}
