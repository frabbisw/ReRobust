@java.lang.Override
public com.imperiled.game.DamageRectangle getDamageRectangle() {
    com.imperiled.game.DamageRectangle newRect = new com.imperiled.game.DamageRectangle();
    System.out.println("log");
    newRect.rectangle.x = this.x;
    newRect.rectangle.y = this.y;
}
