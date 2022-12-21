@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    try {
        if (!(this.hasBeenBuilt)) {
            this.widget.build();
            this.hasBeenBuilt = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
