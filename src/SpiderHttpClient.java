import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderHttpClient {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String url_str = "https://www.mianfeiwendang.com/doc/de31de071cbaba96734ca968/";
        String charset = "utf-8";
        String filepath = "d:/125.html";

        String useragent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36";
        for (int i = 1; i < 22; i++) {
            Document document = Jsoup.connect(url_str + i).userAgent(useragent).get();//获得解析后的document
            Element contents = document.getElementById("contents");
            Elements img = contents.getElementsByClass("img");
            System.out.println("https://www.mianfeiwendang.com" + img.get(0).child(0).attr("src"));
        }
    }

}