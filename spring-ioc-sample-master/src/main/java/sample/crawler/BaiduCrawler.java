package sample.crawler;

import org.springframework.stereotype.Component;

@Component
public class BaiduCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
