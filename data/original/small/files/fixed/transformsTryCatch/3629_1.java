@java.lang.Override
public boolean isPass() {
    try {
        if ((averageScore()) > 50) {
            pass = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pass;
}
