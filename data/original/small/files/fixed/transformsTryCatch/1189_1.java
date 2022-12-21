@java.lang.Override
public void actionPerformed(com.intellij.openapi.actionSystem.AnActionEvent e) {
    com.intellij.openapi.project.Project project = e.getData(PlatformDataKeys.PROJECT);
    try {
        gerritToolWindow.reloadChanges(project, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    gerritUpdatesNotificationComponent.handleNotification();
}
