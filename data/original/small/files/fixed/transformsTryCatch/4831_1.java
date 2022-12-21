@java.lang.Override
public void run() {
    try {
        lbAllImagesFound.setText(((alFindImages.size()) + " шт."));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
