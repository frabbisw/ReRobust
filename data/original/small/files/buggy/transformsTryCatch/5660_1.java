@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    try {
        if ((selected) instanceof view.DText) {
            ((view.DText) (selected)).setFont(comboBox.getSelectedItem().toString(), 1);
            modelChanged(selected.model);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
