package okhttp3.guide;

import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PostExample {
	public static final MediaType JSON = MediaType
			.parse("application/json; charset=utf-8");

	private OkHttpClient client = new OkHttpClient();

	/**
	 * 
	 * @param url
	 * @param json
	 * @return
	 * @throws IOException
	 */
	public String run(String url) throws IOException {
		FormBody body = new FormBody.Builder().add("name", "wangjinyu").build();
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	public static void main(String[] args) throws IOException {
		PostExample example = new PostExample();
		String response = example.run("http://httpbin.org/post");
		System.out.println(response);
	}
}