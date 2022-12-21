@java.lang.Override
public void setDisabledIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    try {
        org.apache.commons.lang.Validate.notNull(icon, "The icon cannot be null!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.disabledIcon = icon.toItem();
    this.getHandle().readItemsFrom(this);
}
