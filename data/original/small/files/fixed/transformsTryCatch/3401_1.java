@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    try {
        if (!(hasBeenBuilt)) {
            widget.build();
            hasBeenBuilt = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
