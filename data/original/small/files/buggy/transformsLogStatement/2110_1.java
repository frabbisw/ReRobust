@java.lang.Override
public android.app.Fragment getItem(int position) {
    System.out.println("log");
    return com.ly.badiane.budgetmanager_finalandroidproject.vues.MainActivity.PlaceholderFragment.newInstance((position + 1));
}
