@java.lang.Override
public void saveOrUpdate() {
    try {
        getRepo().saveOrUpdate(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
