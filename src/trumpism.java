import java.io.IOException;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

public class trumpism{

	public static void main(String[] args) throws IOException {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://matchilling-tronald-dump-v1.p.rapidapi.com/random/quote")
			.get()
			.addHeader("x-rapidapi-host", "matchilling-tronald-dump-v1.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "e54dd7eb6cmsh6c4531f033ca9edp1abaaejsn484314131a58")
			.addHeader("accept", "application/hal+json")
			.build();

		Response response = client.newCall(request).execute();
		String json = response.body().string();
		JSONObject myJ = new JSONObject(json);
		System.out.println(myJ.query("/value"));
		System.out.print(myJ.query("/_embedded/author/0/name"));

		
	}

}

//Copyright Grrrrraaaaaaaahaaaaaam, 2020