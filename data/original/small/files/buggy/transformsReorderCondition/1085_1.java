@java.lang.Override
public final int round(double mean) {
    int n = ((int) (mean));
    if ((mean - n) < (this.random()))
        n++;
    return n;
}
