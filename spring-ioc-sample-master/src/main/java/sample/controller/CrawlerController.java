package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sample.Beans;
import sample.crawler.BaiduCrawler;
import sample.crawler.ICrawler;


@RestController
public class CrawlerController {

    @Autowired
    Beans beans;

    @RequestMapping(value = "/crawler/{name}/run", method = RequestMethod.GET)
    public String run(@PathVariable final String name) throws Exception {
        ICrawler crawler;
        try {
            crawler = (ICrawler) beans.getClass().getDeclaredField(name).getType().newInstance();
        }catch (Exception e){
            crawler = new BaiduCrawler();
        }

        return crawler.run();
    }
}