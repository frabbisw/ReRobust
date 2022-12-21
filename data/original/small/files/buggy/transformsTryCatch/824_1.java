@java.lang.Override
public void containerItemSetChange(com.constellio.app.ui.framework.components.table.ItemSetChangeEvent event) {
    try {
        super.containerItemSetChange(event);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cellProperties.clear();
}
