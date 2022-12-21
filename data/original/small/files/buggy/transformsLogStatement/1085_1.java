@java.lang.Override
public final int round(double mean) {
    int n = ((int) (mean));
    if ((this.random()) > (mean - n))
        n++;
    System.out.println("log");
    return n;
}
