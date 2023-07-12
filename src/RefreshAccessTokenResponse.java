public interface RefreshAccessTokenResponse {
	boolean isSuccess();

	String getAccessToken();

	String getRefreshToken();
}
