@org.zkoss.bind.annotation.Command
@org.zkoss.bind.annotation.NotifyChange(value = { "imagePage", "imageList", "imagePageCount" })
public void nextPage() {
    System.out.println("log");
    if (!(imagePage.equals(imagePageCount.intValue()))) {
        (imagePage)++;
        updateImages();
    }
}
