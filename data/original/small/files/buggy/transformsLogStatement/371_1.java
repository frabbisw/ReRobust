@java.lang.Override
protected void onInstantiate(com.sproutigy.libs.luceneplus.core.LuceneIndex index, java.lang.String name) throws java.io.IOException {
    System.out.println("log");
    if ((cachedNames) == null) {
        names();
        if ((cachedNames) != null) {
            cachedNames.add(name);
        }
    }
}
