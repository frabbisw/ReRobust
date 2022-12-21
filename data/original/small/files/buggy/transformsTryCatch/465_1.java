@java.lang.Override
public int getCount() {
    try {
        if ((distinctRecords.size()) > 0) {
            return distinctRecords.size();
        } else {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
