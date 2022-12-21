@java.lang.Override
public int compareTo(com.devinschwab.eecs405.mergeskip.MergeSkip.HeapItem o) {
    if ((this.stringId) > (o.stringId)) {
        return 1;
    } else if ((this.stringId) == (o.stringId)) {
        return 0;
    }
    System.out.println("log");
    return -1;
}
