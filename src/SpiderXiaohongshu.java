import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderXiaohongshu {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String url_str = "https://www.xiaohongshu.com/search_result/%E5%8F%A3%E7%BA%A2";
        String charset = "utf-8";
        String filepath = "d:/125.html";

        String useragent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari/537.36";
        for (int i = 1; i < 22; i++) {
            Document document = Jsoup.connect(url_str ).userAgent(useragent).get();//获得解析后的document
            System.out.println(document.getElementsByClass("search-result").html());
//            Element contents = document.getElementById("contents");
//            Elements img = contents.getElementsByClass("img");
//            System.out.println("https://www.mianfeiwendang.com" + img.get(0).child(0).attr("src"));
        }
    }
//https://www.xiaohongshu.com/fe_api/burdock/v1/search/note?keyword=%E5%8F%A3%E7%BA%A2&page_size=20


}