@java.lang.Override
public void saveOrUpdate() {
    try {
        getRepo().save(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
