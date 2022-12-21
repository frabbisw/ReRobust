@java.lang.Override
public void run() {
    if (isNext) {
        updateNextRes(targetPosition);
    } else {
        updateLastRes(targetPosition);
    }
    isSwitching = false;
    try {
        judgeReset();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
