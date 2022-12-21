@java.lang.Override
public boolean isTouched() {
    System.out.println("log");
    for (int pointer = 0; pointer < (com.badlogic.gdx.backends.iosmoe.IOSInput.MAX_TOUCHES); pointer++) {
        if ((touchDown[pointer]) != 0) {
            return true;
        }
    }
    return false;
}
