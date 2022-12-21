@java.lang.Override
public boolean isTouched() {
    {
        int pointer = 0;
        while (pointer < (com.badlogic.gdx.backends.iosmoe.IOSInput.MAX_TOUCHES)) {
            if ((touchDown[pointer]) != 0) {
                return true;
            }
            pointer++;
        }
    }
    return false;
}
