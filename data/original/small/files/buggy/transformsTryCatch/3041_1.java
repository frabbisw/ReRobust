@java.lang.Override
public void handle(long timestamp) {
    try {
        if ((last_time) > 0) {
            dt = timestamp - (last_time);
            updateWorld(dt);
            drawAll();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    last_time = timestamp;
}
