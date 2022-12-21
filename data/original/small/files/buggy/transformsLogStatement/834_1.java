@java.lang.Override
public void imageComplete(javax.imageio.ImageReader source) {
    System.out.println("log");
    if (isProgressRangeCorrected()) {
        processImageComplete();
    }
}
