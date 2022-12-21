public void sendVboData() {
    verticesVbo.sendDataAutoBind();
    colorsVbo.sendDataAutoBind();
    try {
        if (indexed) {
            indicesVbo.sendDataAutoBind();
        } else {
            normalsVbo.sendDataAutoBind();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
