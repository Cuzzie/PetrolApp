package com.example.cuzziepetrolapp.util;

import com.example.cuzziepetrolapp.model.Petrol;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cuzzie on 6/8/2017.
 */
public class PetrolPriceScraper {

    public static List<Petrol> scrapePetrolPrice() {
        List<Petrol> petrolList = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("http://petrolpricemalaysia.info/").get();
            for (int i = 0; i < 3; i++) {
                Element name = doc.select("div.rpt_title.rpt_title_" + i).first();
                Element price = doc.select("div.rpt_price.rpt_price_" + i).first();
                Element desc = doc.select("div.rpt_subtitle.rpt_subtitle_" + i).first();
                petrolList.add(new Petrol(name.text(), new BigDecimal(price.text()), desc.text()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return petrolList;
    }

}
