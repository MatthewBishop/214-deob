import com.jagex.oldscape.pub.OtlTokenRequester;

public interface OAuthApi {
	boolean isOnLoginScreen();

	long getAccountHash();

	void setOtlTokenRequester(OtlTokenRequester var1);

	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
