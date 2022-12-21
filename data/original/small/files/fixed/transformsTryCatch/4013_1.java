@org.springframework.transaction.annotation.Transactional
public void remove(int id) {
    com.ontime.model.Project project = this.get(id);
    try {
        dao.remove(project);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
