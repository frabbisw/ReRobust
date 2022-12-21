@java.lang.Override
public int getCount() {
    if (0 == (getmNumColums())) {
        return 0;
    }
    return (mPhooItem.size()) + (mNumColums);
}
