@java.lang.Override
public void setDisabledIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    System.out.println("log");
    org.apache.commons.lang.Validate.notNull(icon, "The icon cannot be null!");
    this.disabledIcon = icon.toItem();
    this.getHandle().readItemsFrom(this);
}
