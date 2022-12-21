public void update(org.newdawn.slick.GameContainer gc, int delta) throws org.newdawn.slick.SlickException {
    super.update(gc, delta);
    clientObject.update(gc, delta);
    try {
        currentInputState = collectInputState(delta, clientObject.getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
