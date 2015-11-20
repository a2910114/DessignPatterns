package com.mykhaylenko.dessign.dellaparser;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by pavlo.mykhaylenko on 11/19/2015.
 */
public class Parser {

    public void getSite(String link) {
        try {
            String description = "";
            String routeStr = "";
            String dateStr = "";
            String priceStr = "";
            String imgLink = "";
            long past = System.currentTimeMillis();
//            Document doc = Jsoup.parse(new URL(link).openStream(), "UTF-8", link);
//            doc.outputSettings().escapeMode(Entities.EscapeMode.base);
//            doc.outputSettings().charset("UTF-8");
            Document doc = Jsoup.connect(link).get();


            Elements information = doc.select("td.distance_header");
            if (information != null) {
                System.out.println("Описание: " + information.get(0).text());
                description = information.get(0).text();
            }

            Elements routes = doc.select("td.route");
            for (Element route : routes) {
                System.out.println("Маршрут: " + route.text());
                routeStr = route.text();
            }

            Elements dates = doc.select("td.multi_date");
            for (Element date : dates) {
                System.out.println("Дата: " + date.text());
                dateStr = date.text();
            }

            Elements prices = doc.select("td.m_price");
            for (Element price : prices) {
                System.out.println("Цена: " + price.text());
                priceStr = price.text();
            }

            Elements stars = doc.select("img.mt_0");
            for (Element star : stars) {
                System.out.println("Cсылка на картинку:  "+"http://della.ua"+star.attr("src"));
                imgLink = "http://della.ua"+star.attr("src");
            }

//            Elements stars2 = doc.select("img[class=mt_0]");
//            for (Element star : stars2) {
//                System.out.println(star.toString());
//                System.out.println(star.attr("src"));
//                System.out.println("http://della.ua"+star.attr("src"));
//            }
            try {
                generateHtmlFile(description, routeStr, dateStr, priceStr, imgLink);
                saveImage(imgLink, routeStr);
            } catch (Exception e) {
                e.printStackTrace();
            }
            long now = System.currentTimeMillis();
            System.out.println("Completed in: "+ ((now - past) / 1000));
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public void generateHtmlFile(String desc, String route, String date, String price, String link) throws Exception{
        File htmlTemplateFile = new File("D:\\My staff\\report.html");
        String htmlString = FileUtils.readFileToString(htmlTemplateFile);
        htmlString = htmlString.replace("${description}", desc);
        htmlString = htmlString.replace("${route}", route);
        htmlString = htmlString.replace("${date}", date);
        htmlString = htmlString.replace("${price}", price);
        htmlString = htmlString.replace("${link}", link);
        File newHtmlFile = new File("D:\\My staff\\generated.html");
        FileUtils.writeStringToFile(newHtmlFile, htmlString);
    }

    public void saveImage(String link, String fileName) throws Exception{
        try(InputStream in = new URL(link).openStream()){
            Files.copy(in, Paths.get("D:\\My staff\\" + fileName + ".gif"));
        }
    }

    public static void main(String[] args) {
        Parser p = new Parser();
        p.getSite("http://della.ua/distance/?cities=5437,208&rc=2315287091206331346");
    }
}
