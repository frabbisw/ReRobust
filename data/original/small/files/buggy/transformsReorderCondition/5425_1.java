public void init() {
    if ((com.rayboot.scantool.cv.org.opencv.android.OpenCVLoader.initDebug()) && (!(isInit))) {
        mLoaderCallback.onManagerConnected(org.opencv.android.LoaderCallbackInterface.SUCCESS);
        isInit = true;
    }
}
