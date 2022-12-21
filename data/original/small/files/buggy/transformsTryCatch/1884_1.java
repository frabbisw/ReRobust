public void addItem(java.lang.String key, hackerrepublic.sarkarsalahkar.models.Post post) {
    posts.add(post);
    keys.add(key);
    try {
        notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
