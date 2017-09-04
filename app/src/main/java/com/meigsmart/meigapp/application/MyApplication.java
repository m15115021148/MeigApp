package com.meigsmart.meigapp.application;

import android.app.Application;

import com.meigsmart.meigapp.util.NetworkUtil;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 入口配置
 * Created by chenMeng on 2017/9/1.
 */
public class MyApplication extends Application {
    private static MyApplication instance;// application对象
    public static NetworkUtil netState;//网络状态

    @Override
    public void onCreate() {
        super.onCreate();
        netState = new NetworkUtil(getApplicationContext());
    }

    public static MyApplication instance() {
        if (instance != null) {
            return instance;
        } else {
            return new MyApplication();
        }
    }

    /**
     * 获取手机网络状态对象
     *
     * @return
     */
    public static NetworkUtil getNetObject() {
        if (netState != null) {
            return netState;
        } else {
            return new NetworkUtil(instance().getApplicationContext());
        }
    }

    /**
     * 描述：MD5加密.
     *(全大写字母)32
     * @param string
     *            要加密的字符串
     * @return String 加密的字符串
     */
    public static String md5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10) hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString().toUpperCase();
    }

}
