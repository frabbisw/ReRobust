private void setupWolf() {
    currentAnimation = com.esbjon.entities.Wolf.animationMoveRight;
    this.addComponentWolves();
    try {
        regionAttribute = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute(com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Diffuse, com.esbjon.entities.Wolf.animationStandRight.getKeyFrame(0.0F));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
