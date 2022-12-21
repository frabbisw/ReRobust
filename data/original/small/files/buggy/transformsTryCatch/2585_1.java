@java.lang.Override
public void execute() {
    try {
        moveShortcut(shortcut, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
