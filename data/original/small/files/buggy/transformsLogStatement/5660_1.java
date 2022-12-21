@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    System.out.println("log");
    if ((selected) instanceof view.DText) {
        ((view.DText) (selected)).setFont(comboBox.getSelectedItem().toString(), 1);
        modelChanged(selected.model);
    }
}
