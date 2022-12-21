@java.lang.Override
public com.laboki.eclipse.plugin.smartsave.instance.Instance begin() {
    this.startListening();
    try {
        com.laboki.eclipse.plugin.smartsave.preferences.ui.SaveIntervalButton.updateText();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.begin();
}
