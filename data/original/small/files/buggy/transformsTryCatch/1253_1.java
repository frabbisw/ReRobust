@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        android.util.Log.e(null, "Browse fragment onResume");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    andrzej.example.com.wordunscrambler.fragments.tabs.DictionariesFragment.otherWindowOpened = true;
}
