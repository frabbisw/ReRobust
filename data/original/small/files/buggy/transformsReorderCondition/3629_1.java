@java.lang.Override
public boolean isPass() {
    boolean pass = false;
    if (50 < (averageScore())) {
        pass = true;
    }
    return pass;
}
