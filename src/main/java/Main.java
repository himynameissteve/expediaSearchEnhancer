import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {

    public static void main(String... args) {
        try {
            Document doc = Jsoup.connect("https://www.expedia.de/")
                    .userAgent("Mozilla")
                    .get();
            String title = doc.title();
            System.out.print(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
