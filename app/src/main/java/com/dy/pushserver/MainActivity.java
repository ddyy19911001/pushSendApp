package com.dy.pushserver;



import android.view.View;

import yin.deng.superbase.activity.SuperBaseActivity;

public class MainActivity extends SuperBaseActivity {

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initFirst() {

    }




    public void click(View view) {
        MsgNotifyInfo msgNotifyInfo=new MsgNotifyInfo();
        msgNotifyInfo.setTitle("中奖拉");
        msgNotifyInfo.setContext("恭喜您中奖获得500w");
        msgNotifyInfo.setTicker("你有一条新消息");
        msgNotifyInfo.setIcImgRes(R.mipmap.ic_launcher);
        try {
            ServerDataUtils.sendAndroidUnicast(msgNotifyInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
