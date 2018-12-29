package sample.crawler;

import org.springframework.stereotype.Component;

@Component
public class GoogleCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
