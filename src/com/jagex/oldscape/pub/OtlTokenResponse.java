package com.jagex.oldscape.pub;

public interface OtlTokenResponse {
	boolean isSuccess();

	String getAccessToken();

	String getRefreshToken();

	String getToken();
}
