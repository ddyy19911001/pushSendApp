package com.dy.pushserver;

public interface ServerConfig {
    String host="http://msg.umeng.com/";
    String url="api/send?sign=";
    String masterSercreat="b2bwhnizscouquoyhagugmw2kg7mmbo2";
    String appKey="599e40aeb27b0a19d9000108";
    String needPushDeviceToken="Au04mKmJZMwfyHY-dqwYI-MN-ymmuHQCFv6lpAUkcgms";//被推送的设备token，一般由自己的服务器保存下来，推送端进行按需推送

}
