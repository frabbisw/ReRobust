@java.lang.Override
public java.util.ArrayList<java.lang.String> getData(java.lang.String query) {
    System.out.println("log");
    database.Categories.getKategorien(query);
    return null;
}
