@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    return (mLists.size()) + (mHotLists.size());
}
