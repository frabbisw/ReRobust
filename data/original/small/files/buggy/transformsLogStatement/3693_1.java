@java.lang.Override
public boolean isPressed(int keyCode) {
    System.out.println("log");
    return (keyPressed.length) < keyCode ? keyPressed[keyCode] : false;
}
