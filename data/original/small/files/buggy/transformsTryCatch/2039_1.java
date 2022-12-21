@java.lang.Override
public void run() {
    try {
        if (isFireHeldDown) {
            if (!(shootLaser())) {
                isFireHeldDown = false;
            }
        } else if (!(isFireHeldDown)) {
            cancel();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
