@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(null, "Browse fragment onResume");
    System.out.println("log");
    andrzej.example.com.wordunscrambler.fragments.tabs.DictionariesFragment.otherWindowOpened = true;
}
