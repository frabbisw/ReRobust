public void setVisible(boolean visible, com.betmansmall.game.GameInterface.GameInterfaceElements element) {
    try {
        getElement(element).setVisible(visible);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Gdx.app.log("TAAAAAAAAAG", ((("set " + visible) + " but") + (element.name())));
}
