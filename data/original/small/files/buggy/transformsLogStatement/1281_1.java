private float modelCoordYToCanvas(float y, float minY, float canvasDimension, float bDimension, float[] boundingBox) {
    System.out.println("log");
    return minY + ((((boundingBox[3]) + y) / bDimension) * canvasDimension);
}
