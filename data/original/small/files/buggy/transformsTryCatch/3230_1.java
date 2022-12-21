@org.jetbrains.annotations.Nullable
private com.intellij.openapi.projectRoots.Sdk getCurrentProjectJdk() {
    com.intellij.openapi.roots.ui.configuration.projectRoot.ProjectSdksModel projectJdksModel = new com.intellij.openapi.roots.ui.configuration.projectRoot.ProjectSdksModel();
    try {
        projectJdksModel.reset(commonModel.getProject());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return projectJdksModel.getProjectSdk();
}
