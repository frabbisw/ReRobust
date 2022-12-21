public void sendVboData() {
    verticesVbo.sendDataAutoBind();
    colorsVbo.sendDataAutoBind();
    System.out.println("log");
    if (indexed) {
        indicesVbo.sendDataAutoBind();
    } else {
        normalsVbo.sendDataAutoBind();
    }
}
