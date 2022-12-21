@java.lang.Override
public void index(org.xbib.elasticsearch.plugin.jdbc.util.IndexableObject object, boolean create) throws java.io.IOException {
    this.index = rebuild_index;
    try {
        object.index(rebuild_index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.index(object, create);
}
