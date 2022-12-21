@java.lang.Override
public boolean isTouched() {
    for (int pointer = 0; (com.badlogic.gdx.backends.iosmoe.IOSInput.MAX_TOUCHES) > pointer; pointer++) {
        if ((touchDown[pointer]) != 0) {
            return true;
        }
    }
    return false;
}
