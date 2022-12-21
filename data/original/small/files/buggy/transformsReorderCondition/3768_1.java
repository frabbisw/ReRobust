public void setVisible(boolean visible, com.betmansmall.game.GameInterface.GameInterfaceElements element) {
    getElement(element).setVisible(visible);
    Gdx.app.log("TAAAAAAAAAG", ((element.name()) + (("set " + visible) + " but")));
}
