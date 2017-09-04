package com.meigsmart.meigapp.config;

/**
 * 常量配置
 * Created by chenMeng on 2017/9/1.
 */

public class ResultCode {

    //	string类型常量
    public static final String ERRORINFO = "服务器连接超时";//网络连接错误信息
    public static final String NONETWORK = "网络不可用";//网络无法连接

    /**注册规则*/
    public static final String REGISTERTOOT = "密码不符合规范";

    //	int类型常量
    public static final int REGISTER = 0x001;//注册常量
    public static final int LOGIN = 0x002;//登录常量

}
