public boolean analyze() throws java.io.IOException, java.net.URISyntaxException {
    boolean success = false;
    int faceNum = Utils.FaceRec.getFaceNum(imageURL);
    try {
        Utils.FaceRec.faceAnalyze(imageURL, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(faceNum);
    success = true;
    return success;
}
