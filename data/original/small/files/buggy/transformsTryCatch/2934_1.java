@java.lang.Override
public void update(org.newdawn.slick.GameContainer container, int delta) {
    try {
        _input.update(container, this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
