@java.lang.Override
public void run() {
    try {
        if (isNext) {
            updateNextRes(targetPosition);
        } else {
            updateLastRes(targetPosition);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
