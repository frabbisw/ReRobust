public void sendVboData() {
    try {
        verticesVbo.sendDataAutoBind();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    colorsVbo.sendDataAutoBind();
    if (indexed) {
        indicesVbo.sendDataAutoBind();
    }
    if ((normalsVbo) != null) {
        normalsVbo.sendDataAutoBind();
    }
}
