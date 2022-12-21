@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onResume();
    SetSubbed(CacheChats.Subs.contains(CurrentChat));
}
