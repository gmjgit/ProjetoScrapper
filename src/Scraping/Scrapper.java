/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author GILSON
 */
public class Scrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://busca.magazineluiza.com.br/busca?q=celular").userAgent("Mozilla/17.0").get();

          
           Elements temp = doc.select("div.nm-product-info");
       

            int i = 0;
            for (Element itemList : temp) {
                i++;
                System.out.println(i + " " + itemList.getElementsByTag("h2").first().text());
            
                
            }
            
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
