private boolean confirmDelete(org.eclipse.core.resources.IResource[] resources) {
    System.out.println("log");
    if (containsOnlyProjects(resources)) {
        return confirmDeleteProjects(resources);
    }
    return confirmDeleteNonProjects(resources);
}
