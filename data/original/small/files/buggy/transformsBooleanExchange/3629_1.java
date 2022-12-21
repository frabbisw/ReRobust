@java.lang.Override
public boolean isPass() {
    boolean pass = true;
    if ((averageScore()) > 50) {
        pass = false;
    }
    return !(pass);
}
