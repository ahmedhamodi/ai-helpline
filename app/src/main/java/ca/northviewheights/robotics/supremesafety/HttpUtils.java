package ca.northviewheights.robotics.supremesafety;

import android.widget.TextView;

import com.loopj.android.http.*;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpUtils {
    private static final String BASE_URL = "https://quotes.rest/qod";

    private static TextView tv;
    private static TextView author_tv;
    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void getByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(url, params, responseHandler);
    }

    public static void postByUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(url, params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL;
    }

    public static String getQuote(TextView qNumber, TextView qNumber1){
        tv = qNumber;
        author_tv = qNumber1;
        RequestParams rp = new RequestParams();
        rp.add("category","inspire");
        JsonHttpHandler jp = new JsonHttpHandler();
        //HttpUtils.get("t", rp,jp);
        callback(new JSONObject());
//        byte[] buffer;
//        jp.getResponseString(buffer, )
        return jp.response_string.toString();
    }

    public static void callback(JSONObject obj){

        String json_test = "{\n" +
                "  \"success\": {\n" +
                "    \"total\": 1\n" +
                "  },\n" +
                "  \"contents\": {\n" +
                "    \"quotes\": [\n" +
                "      {\n" +
                "        \"quote\": \"The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.\",\n" +
                "        \"author\": \"Helen Keller\",\n" +
                "        \"length\": \"303\",\n" +
                "        \"tags\": [\n" +
                "          \"fear\",\n" +
                "          \"inspire\"\n" +
                "        ],\n" +
                "        \"category\": \"inspire\",\n" +
                "        \"title\": \"Inspiring Quote of the day\",\n" +
                "        \"date\": \"2019-01-26\",\n" +
                "        \"id\": null\n" +
                "      }\n" +
                "    ],\n" +
                "    \"copyright\": \"2017-19 theysaidso.com\"\n" +
                "  }\n" +
                "}";

        try {
            obj = new JSONObject(json_test);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            tv.setText(obj.getJSONObject("contents").getJSONArray("quotes").getJSONObject(0).get("quote").toString());
            author_tv.setText(obj.getJSONObject("contents").getJSONArray("quotes").getJSONObject(0).get("author").toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //System.out.println("Here");
    }
}
