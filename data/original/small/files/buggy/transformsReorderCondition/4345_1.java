@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    java.lang.System.out.println((" equip" + name));
    p.inventory.equiped.equip(itm);
}
