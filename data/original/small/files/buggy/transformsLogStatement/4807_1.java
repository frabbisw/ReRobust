@java.lang.Override
public projectx.persistence.entities.Category findByid(long id) {
    System.out.println("log");
    db.findCategoryById(id);
}
