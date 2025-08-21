import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

class HTML_processing {
    void html_process(String path) {
        try {
            File file = new File(path);
            Document doc = Jsoup.parse(file, "UTF-8");

            for(Element link : doc.select("a")) {
                System.out.println(link.attr("href"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class test{
    public static void main(String[]agg) {
        HTML_processing obj = new HTML_processing();
        obj.html_process("D:\\gdrive upload\\project_dump\\www.geeksforgeeks.org_.html");
    }

}
