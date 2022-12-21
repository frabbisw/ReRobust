@java.lang.Override
public boolean queryFromCache() {
    try {
        db.queryAuthors(handleFilter, visitor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
