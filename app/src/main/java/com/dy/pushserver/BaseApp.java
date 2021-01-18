package com.dy.pushserver;

import com.dy.fastframework.application.SuperBaseApp;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.config.HttpGlobalConfig;

public class BaseApp extends SuperBaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        ViseHttp.CONFIG().setOnRequestWatingDialogListener(new HttpGlobalConfig.OnRequestWatingDialogListener() {
            @Override
            public void onTimeOverToShowLoading() {

            }

            @Override
            public void onRequestOverLoadingNeedClose() {

            }
        });
    }

    @Override
    protected String setBaseUrl() {
        return ServerConfig.host;
    }

    @Override
    public boolean closeDebugLog() {
        return false;
    }
}
