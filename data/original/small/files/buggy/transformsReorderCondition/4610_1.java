@java.lang.Override
public void onClick(android.view.View view) {
    if (0 == (tabs.getCurrentTab())) {
        launchEditItem(MainActivity.FragmentType.DETAILS_INCOME, null);
    } else {
        launchEditItem(MainActivity.FragmentType.DETAILS_EXPENDITURE, null);
    }
}
