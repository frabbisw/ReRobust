@java.lang.Override
public int compareTo(org.fyrz.solr.explain.model.FieldMatch o) {
    try {
        if (equals(o)) {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return getScore().compareTo(o.getScore());
}
