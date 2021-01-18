package com.dy.pushserver;

import com.dy.pushserver.framwork.AndroidNotification;
import com.dy.pushserver.framwork.AndroidUnicast;
import com.dy.pushserver.framwork.PushClient;
import com.dy.pushserver.framwork.UmengNotification;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.digest.*;
import static com.dy.pushserver.ServerConfig.needPushDeviceToken;

public class ServerDataUtils {
    public static void sendAndroidUnicast(MsgNotifyInfo notifyInfo){
        AndroidUnicast unicast = null;
        try {
            unicast = new AndroidUnicast(ServerConfig.appKey,ServerConfig.masterSercreat);
            // TODO Set your device token
            unicast.setDeviceToken(needPushDeviceToken);
            if(notifyInfo.getIcImgRes()!=0){
                unicast.setLargeIcon(String.valueOf(notifyInfo.getIcImgRes()));
            }
            unicast.setTicker( notifyInfo.getTicker());
            unicast.setTitle(  notifyInfo.getTitle());
            unicast.setText(   notifyInfo.getContext());
            unicast.goAppAfterOpen();
            unicast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
            PushClient client=new PushClient();
            client.send(unicast);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
