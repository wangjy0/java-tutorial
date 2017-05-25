package okhttp3.guide;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {

	private OkHttpClient client = new OkHttpClient();

	/**
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public String run(String url) throws IOException {
		Request request = new Request.Builder().url(url).get().build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	public static void main(String[] args) throws IOException {
		GetExample example = new GetExample();
		String response = example.run("http://httpbin.org/get");
		System.out.println(response);
	}

}
