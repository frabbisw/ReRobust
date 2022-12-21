@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent event) {
    try {
        if ((ui.views.CommitsView.combo.getSelectionIndex()) != (-1)) {
            java.lang.String branch = ui.views.CommitsView.combo.getItem(ui.views.CommitsView.combo.getSelectionIndex());
            ui.views.CommitsView.showCommits(project, branch);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
