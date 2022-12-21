@java.lang.Override
public int getCount() {
    if (0 < (distinctRecords.size())) {
        return distinctRecords.size();
    } else {
        return 0;
    }
}
