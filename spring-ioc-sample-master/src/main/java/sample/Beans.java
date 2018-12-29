package sample;

import org.springframework.stereotype.Component;
import sample.crawler.BaiduCrawler;
import sample.crawler.BingCrawler;
import sample.crawler.GoogleCrawler;
import sample.crawler.SoGouCrawler;

@Component
public class Beans {

    private BaiduCrawler BaiduCrawler;
    private GoogleCrawler GoogleCrawler;
    private SoGouCrawler SoGouCrawler;
    private BingCrawler BingCrawler;

    public sample.crawler.BaiduCrawler getBaiduCrawler() {
        return BaiduCrawler;
    }

    public void setBaiduCrawler(sample.crawler.BaiduCrawler baiduCrawler) {
        BaiduCrawler = baiduCrawler;
    }

    public sample.crawler.GoogleCrawler getGoogleCrawler() {
        return GoogleCrawler;
    }

    public void setGoogleCrawler(sample.crawler.GoogleCrawler googleCrawler) {
        GoogleCrawler = googleCrawler;
    }

    public sample.crawler.SoGouCrawler getSoGouCrawler() {
        return SoGouCrawler;
    }

    public void setSoGouCrawler(sample.crawler.SoGouCrawler soGouCrawler) {
        SoGouCrawler = soGouCrawler;
    }

    public sample.crawler.BingCrawler getBingCrawler() {
        return BingCrawler;
    }

    public void setBingCrawler(sample.crawler.BingCrawler bingCrawler) {
        BingCrawler = bingCrawler;
    }
}
