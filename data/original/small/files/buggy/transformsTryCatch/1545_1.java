public com.badlogic.gdx.graphics.g3d.ModelInstance getModel() {
    try {
        updateTransform();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return model;
}
