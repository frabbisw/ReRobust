@java.lang.Override
public int getCount() {
    try {
        if ((getmNumColums()) == 0) {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return (mPhooItem.size()) + (mNumColums);
}
