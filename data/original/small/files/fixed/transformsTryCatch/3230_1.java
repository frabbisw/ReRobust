@org.jetbrains.annotations.Nullable
private com.intellij.openapi.projectRoots.Sdk getCurrentProjectJdk() {
    try {
        projectJdksModel.reset(commonModel.getProject());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return projectJdksModel.getProjectSdk();
}
