@java.lang.Override
public void containerItemSetChange(com.constellio.app.ui.framework.components.table.ItemSetChangeEvent event) {
    System.out.println("log");
    super.containerItemSetChange(event);
    cellProperties.clear();
}
