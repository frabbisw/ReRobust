public void SetSubbed() {
    try {
        SetSubbed(CacheChats.Subs.contains(CurrentChat));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
