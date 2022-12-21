@java.lang.Override
public projectx.persistence.entities.Category findByid(long id) {
    try {
        db.findCategoryById(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
