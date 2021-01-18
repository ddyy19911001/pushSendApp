package com.dy.pushserver;

import java.io.Serializable;

public class MsgNotifyInfo implements Serializable {
    private String ticker;
    private String title;
    private String context;
    private int icImgRes;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getIcImgRes() {
        return icImgRes;
    }

    public void setIcImgRes(int icImgRes) {
        this.icImgRes = icImgRes;
    }
}
