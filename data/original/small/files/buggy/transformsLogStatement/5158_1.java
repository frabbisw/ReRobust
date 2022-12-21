@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    return (mCursor.getCount()) + 1;
}
