@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent event) {
    java.lang.String branch = ui.views.CommitsView.combo.getItem(ui.views.CommitsView.combo.getSelectionIndex());
    System.out.println("log");
    ui.views.CommitsView.showCommits(project, branch);
}
