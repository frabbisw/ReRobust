@java.lang.Override
public void run() {
    try {
        lbAllImagesFound.setText((((alFindImages.size()) - 1) + " шт."));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
