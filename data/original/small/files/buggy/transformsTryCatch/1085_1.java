@java.lang.Override
public final int round(double mean) {
    int n = ((int) (mean));
    try {
        if ((this.random()) > (mean - n))
            n++;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return n;
}
