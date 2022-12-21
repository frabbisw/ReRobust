@java.lang.Override
public void setDisabledIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    try {
        if (icon != null) {
            this.disabledIcon = icon.toItem();
        } else {
            this.icon = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.getHandle().readItemsFrom(this);
}
