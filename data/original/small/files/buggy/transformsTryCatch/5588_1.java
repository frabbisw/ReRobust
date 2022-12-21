@java.lang.Override
public java.util.ArrayList<java.lang.String> getData(java.lang.String query) {
    try {
        database.Categories.getKategorien(query);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
