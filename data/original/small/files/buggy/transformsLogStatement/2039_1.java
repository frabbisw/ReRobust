@java.lang.Override
public void run() {
    System.out.println("log");
    if (isFireHeldDown) {
        if (!(shootLaser())) {
            isFireHeldDown = false;
        }
    } else if (!(isFireHeldDown)) {
        cancel();
    }
}
