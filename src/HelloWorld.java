import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

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

        // news.naver.com에서 html 소스 받아오기
        htmlCode = getUrlSource("http://news.naver.com/");

        // 받아온 소스에서 title 부분 전부 split 하여 배열에 넣기
        String[] titles = htmlCode.split("title = \"");

        for (String t : titles) {
            String title;
            title = t.split("\"")[0]; // title 뒷부분에 불필요한 문자 삭제 (큰따옴표까지)

            System.out.println(title); // 제목 출력
        }

        //System.out.println(htmlCode);
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
