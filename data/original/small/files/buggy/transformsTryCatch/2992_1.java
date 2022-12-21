@java.lang.Override
public void onTabClick(int index) {
    try {
        setCurrentItem(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
