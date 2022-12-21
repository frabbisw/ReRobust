public boolean analyze() throws java.io.IOException, java.net.URISyntaxException {
    boolean success = true;
    int faceNum = Utils.FaceRec.getFaceNum(imageURL);
    Utils.FaceRec.faceAnalyze(imageURL);
    java.lang.System.out.println(faceNum);
    success = false;
    return !(success);
}
