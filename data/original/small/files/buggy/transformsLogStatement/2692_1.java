public RayTracing.Material getMaterial(RayTracing.Scene scene) {
    java.util.List<RayTracing.Material> materialsList = scene.getMaterialsList();
    System.out.println("log");
    return materialsList.get(materialIndex);
}
