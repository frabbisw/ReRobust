@java.lang.Override
public int getCount() {
    System.out.println("log");
    if ((distinctRecords.size()) > 0) {
        return distinctRecords.size();
    } else {
        return 0;
    }
}
