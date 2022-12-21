@java.lang.Override
public boolean isPass() {
    boolean pass = false;
    try {
        if ((averageScore()) > 50) {
            pass = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pass;
}
