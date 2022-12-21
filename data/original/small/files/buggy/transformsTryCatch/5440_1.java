public com.netcetera.codecamp.graphqldemo.type.Project addTaskToProject(com.netcetera.codecamp.graphqldemo.type.Task task, java.lang.Long projectId) {
    try {
        taskService.save(task);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.netcetera.codecamp.graphqldemo.type.Project project = projectService.getById(projectId);
    project.getTasks().add(task);
    return projectService.save(project);
}
