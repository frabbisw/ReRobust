@org.zkoss.bind.annotation.Command
@org.zkoss.bind.annotation.NotifyChange(value = { "imagePage", "imageList", "imagePageCount" })
public void nextPage() {
    try {
        if (!(imagePage.equals(imagePageCount.intValue()))) {
            (imagePage)++;
            updateImages();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
