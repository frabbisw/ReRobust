public boolean analyze() throws java.io.IOException, java.net.URISyntaxException {
    boolean success = false;
    int faceNum = Utils.FaceRec.getFaceNum(imageURL);
    Utils.FaceRec.faceAnalyze(imageURL);
    try {
        java.lang.System.out.println(faceNum);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    success = true;
    return success;
}
