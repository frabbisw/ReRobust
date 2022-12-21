public void batch() {
    try {
        doBatch();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.jme3.scene.BatchNode.Batch batch : batches.getArray()) {
        batch.geometry.setIgnoreTransform(true);
        batch.geometry.setUserData(UserData.JME_PHYSICSIGNORE, true);
    }
}
