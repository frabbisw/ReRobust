@java.lang.Override
public int getCount() {
    try {
        if ((distinctRecords.size()) > 0) {
            return distinctRecords.size();
        } else {
            return 1;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
