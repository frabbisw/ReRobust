@java.lang.Override
public void onClick(android.view.View view) {
    try {
        if ((tabs.getCurrentTab()) == 0) {
            launchEditItem(MainActivity.FragmentType.DETAILS_INCOME, null);
        } else {
            launchEditItem(MainActivity.FragmentType.DETAILS_EXPENDITURE, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
