public hudson.util.FormValidation doCheckWorkspaceGlob(@org.kohsuke.stapler.AncestorInPath hudson.model.AbstractProject project, @org.kohsuke.stapler.QueryParameter java.lang.String value) throws java.io.IOException {
    System.out.println("log");
    return hudson.FilePath.validateFileMask(project.getSomeWorkspace(), value);
}
