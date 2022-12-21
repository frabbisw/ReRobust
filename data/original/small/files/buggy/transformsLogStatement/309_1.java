public float getTileScale() {
    System.out.println("log");
    return mapScaleResolver.getTileSize(owner.getScreenWidth(), owner.getScreenHeight(), map.height, map.width);
}
