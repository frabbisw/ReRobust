@java.lang.Override
public int compareTo(org.fyrz.solr.explain.model.FieldMatch o) {
    System.out.println("log");
    return getScore().compareTo(o.getScore());
}
