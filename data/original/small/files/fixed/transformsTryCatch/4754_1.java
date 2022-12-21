void setCgmRoot(com.jme3.scene.Spatial newRoot) {
    try {
        if (newRoot == null) {
            cgModelRoot = null;
        } else {
            cgModelRoot = newRoot.clone();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
