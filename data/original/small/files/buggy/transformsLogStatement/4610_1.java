@java.lang.Override
public void onClick(android.view.View view) {
    System.out.println("log");
    if ((tabs.getCurrentTab()) == 0) {
        launchEditItem(MainActivity.FragmentType.DETAILS_INCOME, null);
    } else {
        launchEditItem(MainActivity.FragmentType.DETAILS_EXPENDITURE, null);
    }
}
