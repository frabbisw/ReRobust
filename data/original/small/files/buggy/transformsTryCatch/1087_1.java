@java.lang.Override
public void onTabSelected(int position) {
    try {
        SameActionTab(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
