
package org.example;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.*;
import java.util.*;

class soupTest {
    public static void main(String[] args) {
        System.out.println("This is an web scraping tool\nPlease enter the url that you want to crawl through\n\n");
        td thread_1_obj=new td("https://www.youtube.com/watch?v=nKZb4iX6v-k");
        td thread_2_obj=new td("https://youtube.com/");
//        System.out.println("Thread 1 started");
        thread_1_obj.start();



    }
}