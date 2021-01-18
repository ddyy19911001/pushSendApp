package com.dy.pushserver.framwork;

import com.dy.fastframework.downloader.httpclient.DefaultHttpClient;
import com.dy.fastframework.downloader.httpclient.HttpClient;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.callback.ACallback;

import org.apache.commons.codec.digest.DigestUtils;

public class PushClient {
	
	// The user agent
	protected final String USER_AGENT = "Mozilla/5.0";

	// This object is used for sending the post request to Umeng
	protected HttpClient client = new DefaultHttpClient();
	
	// The host
	protected static final String host = "http://msg.umeng.com";
	
	// The upload path
	protected static final String uploadPath = "/upload";
	
	// The post path
	protected static final String postPath = "/api/send";

	public void send(UmengNotification msg) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));
		msg.setPredefinedKeyValue("timestamp", timestamp);
        String url = host + postPath;
        String postBody = msg.getPostBody();
        String sign = DigestUtils.md5Hex(("POST" + url + postBody + msg.getAppMasterSecret()).getBytes("utf8"));
        url = url + "?sign=" + sign;
		ViseHttp.POST(url)
				.setJson(postBody)
				.request(new ACallback<String>() {
					@Override
					public void onSuccess(String data) {

					}

					@Override
					public void onFail(int errCode, String errMsg) {

					}
				});
    }


}
