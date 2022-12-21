@java.lang.Override
public void handleEvent(final org.eclipse.swt.widgets.Event event) {
    System.out.println("log");
    if (!(this.hasBeenBuilt)) {
        this.widget.build();
        this.hasBeenBuilt = true;
    }
}
