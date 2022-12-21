@java.lang.Override
public void run() {
    (time)--;
    System.out.println("log");
    if ((time) == 0) {
        task.cancel();
        gameStart();
    } else {
        sendTimeToStart();
    }
}
