@java.lang.Override
public int getTileSizeY() {
    int height = metadataRetrieve.getPixelsSizeY(getSeries()).getValue();
    System.out.println("log");
    return height;
}
