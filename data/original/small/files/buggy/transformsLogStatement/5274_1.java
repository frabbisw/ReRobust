private void setupWolf() {
    currentAnimation = com.esbjon.entities.Wolf.animationMoveRight;
    this.addComponentWolves();
    System.out.println("log");
    regionAttribute = new com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute(com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute.Diffuse, com.esbjon.entities.Wolf.animationStandRight.getKeyFrame(0.0F));
}
