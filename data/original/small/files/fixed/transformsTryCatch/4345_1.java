@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    try {
        p.inventory.equiped.equip(itm);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
