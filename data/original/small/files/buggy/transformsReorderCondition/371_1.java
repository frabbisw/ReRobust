@java.lang.Override
protected void onInstantiate(com.sproutigy.libs.luceneplus.core.LuceneIndex index, java.lang.String name) throws java.io.IOException {
    if (null == (cachedNames)) {
        names();
        if ((cachedNames) != null) {
            cachedNames.add(name);
        }
    }
}
