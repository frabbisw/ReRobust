@java.lang.Override
public void run() {
    (time)--;
    try {
        if ((time) == 0) {
            task.cancel();
            task = null;
            gameStart();
        } else {
            sendTimeToStart();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
