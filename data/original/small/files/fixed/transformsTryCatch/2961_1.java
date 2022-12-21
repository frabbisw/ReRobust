@java.lang.Override
protected boolean onClicked(@javax.annotation.Nonnull final com.kamesuta.mc.bnnwidget.WEvent ev, @javax.annotation.Nonnull final com.kamesuta.mc.bnnwidget.position.Area pgp, @javax.annotation.Nonnull final com.kamesuta.mc.bnnwidget.position.Point p, final int button) {
    try {
        this.box.add(this.widget.build());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
