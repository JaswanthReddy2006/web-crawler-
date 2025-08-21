package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.*;
import org.example.WebErrorHandler;

class td extends Thread {
    private String url;

    td(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            System.out.println(" [" + url + "]  Searching the URL\n\n");
            HttpClient hc = HttpClient.newHttpClient();
            HttpRequest HR = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = hc.send(HR, HttpResponse.BodyHandlers.ofString());
            WebErrorHandler web_handle_obj = new WebErrorHandler();
            web_handle_obj.errorhandle(response.statusCode(),url);
            String path="D:\\project_dump";
            String safeFileName = url.replaceAll("[^a-zA-Z0-9.-]", "_");
            FileWriter writer=new FileWriter(path+"\\"+safeFileName.substring(8)+".html");
            writer.write(response.body());
            writer.close();
            System.out.println("✅ Full HTML saved to: " + safeFileName+"\n\n");
        } catch (Exception e) {
            System.out.println("Unable to search the URL due to an issue: " + e.getMessage());
        }
    }
}
