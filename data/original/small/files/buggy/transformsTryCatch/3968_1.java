@java.lang.Override
public void run() {
    try {
        lcdLines[localI].set((str + "                    ").substring(0, 20));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
