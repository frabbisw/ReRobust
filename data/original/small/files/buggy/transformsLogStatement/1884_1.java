public void addItem(java.lang.String key, hackerrepublic.sarkarsalahkar.models.Post post) {
    System.out.println("log");
    posts.add(post);
    keys.add(key);
    notifyDataSetChanged();
}
