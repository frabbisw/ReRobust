@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    andrzej.example.com.wordunscrambler.fragments.tabs.DictionariesFragment.otherWindowOpened = true;
}
