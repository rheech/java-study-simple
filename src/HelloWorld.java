import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Cheong on 2/11/2017.
 */
public class HelloWorld {

    /**
     * 메인 함수
     * @param args
     */
    public static void main(String[] args) throws Exception {

        String htmlCode;

        htmlCode = getUrlSource("http://news.naver.com/");

        System.out.println(htmlCode);
    }

    /**
     * html 소스 받아오는 코드
     * http://stackoverflow.com/questions/8616781/how-to-get-a-web-pages-source-code-from-java
     * @param url 소스 받아올 웹주소
     * @return html 코드
     * @throws IOException
     */
    private static String getUrlSource(String url) throws IOException {
        URL yahoo = new URL(url);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream(), "euc-kr")); // 인코딩을 euc-kr로 변경
        String inputLine;
        StringBuilder a = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            a.append(inputLine);
        in.close();

        return a.toString();
    }
}
