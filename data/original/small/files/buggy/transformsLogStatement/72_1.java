@java.lang.Override
public int getCount() {
    if ((getmNumColums()) == 0) {
        return 0;
    }
    System.out.println("log");
    return (mPhooItem.size()) + (mNumColums);
}
