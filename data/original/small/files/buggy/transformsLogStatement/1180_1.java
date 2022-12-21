@java.lang.Override
public void saveOrUpdate() {
    System.out.println("log");
    getRepo().save(this);
}
