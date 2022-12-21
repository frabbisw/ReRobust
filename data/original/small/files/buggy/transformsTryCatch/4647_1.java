@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    SetSubbed(CacheChats.Subs.contains(CurrentChat));
}
