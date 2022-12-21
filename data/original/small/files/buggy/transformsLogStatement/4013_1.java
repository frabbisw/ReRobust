@org.springframework.transaction.annotation.Transactional
public void remove(int id) {
    System.out.println("log");
    com.ontime.model.Project project = new com.ontime.model.Project();
    project.setId(id);
    dao.remove(project);
}
