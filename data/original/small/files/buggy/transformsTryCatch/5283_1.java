private boolean confirmDelete(org.eclipse.core.resources.IResource[] resources) {
    try {
        if (containsOnlyProjects(resources)) {
            return confirmDeleteProjects(resources);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return confirmDeleteNonProjects(resources);
}
