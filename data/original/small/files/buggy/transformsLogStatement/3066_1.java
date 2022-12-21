@java.lang.Override
public boolean queryFromCache() {
    db.queryAuthors(handleFilter, visitor);
    System.out.println("log");
    return true;
}
