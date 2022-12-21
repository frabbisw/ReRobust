@java.lang.Override
public void run() {
    try {
        if (isFireHeldDown) {
            shootLaser();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
