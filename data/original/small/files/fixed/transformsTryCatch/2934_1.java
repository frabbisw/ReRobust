@java.lang.Override
public void update(org.newdawn.slick.GameContainer container, int delta) {
    try {
        for (int i = 0; i < delta; i++) {
            _input.update(container, this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
