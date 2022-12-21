@java.lang.Override
protected void onInstantiate(com.sproutigy.libs.luceneplus.core.LuceneIndex index, java.lang.String name) throws java.io.IOException {
    if ((cachedNames) == null) {
        names();
    }
    try {
        if ((cachedNames) != null) {
            cachedNames.add(name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
