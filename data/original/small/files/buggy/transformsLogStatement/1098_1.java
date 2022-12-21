@org.springframework.web.bind.annotation.RequestMapping(value = "/keywords")
public java.util.HashSet<uk.co.corbas.slides.model.Keyword> list() {
    System.out.println("log");
    uk.co.corbas.slides.db.KeywordService kws = new uk.co.corbas.slides.db.KeywordService();
    return kws.listKeywords();
}
