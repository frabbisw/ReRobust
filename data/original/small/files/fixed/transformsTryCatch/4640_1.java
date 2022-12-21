@java.lang.Override
public com.laboki.eclipse.plugin.smartsave.instance.Instance begin() {
    this.startListening();
    try {
        this.updateText();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.begin();
}
