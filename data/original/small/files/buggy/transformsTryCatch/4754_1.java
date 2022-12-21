void setCgmRoot(com.jme3.scene.Spatial newRoot) {
    try {
        cgModelRoot = newRoot.clone();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
