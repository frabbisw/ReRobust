public void addItem(java.lang.String key, hackerrepublic.sarkarsalahkar.models.Post post) {
    try {
        posts.add(0, post);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    keys.add(0, key);
    notifyDataSetChanged();
}
