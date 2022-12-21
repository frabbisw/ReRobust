@java.lang.Override
public void handle(long now) {
    try {
        if (!(oops))
            update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
