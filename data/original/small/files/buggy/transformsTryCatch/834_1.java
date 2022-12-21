@java.lang.Override
public void imageComplete(javax.imageio.ImageReader source) {
    try {
        if (isProgressRangeCorrected()) {
            processImageComplete();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
