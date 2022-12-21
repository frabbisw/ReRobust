@java.lang.Override
public void handle(long timestamp) {
    if (0 < (last_time)) {
        dt = timestamp - (last_time);
        updateWorld(dt);
        drawAll();
    }
    last_time = timestamp;
}
