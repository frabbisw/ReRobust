@java.lang.Override
public void run() {
    if (isNext) {
        updateNextRes(targetPosition);
    } else {
        updateLastRes(targetPosition);
    }
    System.out.println("log");
    isSwitching = false;
    judgeReset();
}
