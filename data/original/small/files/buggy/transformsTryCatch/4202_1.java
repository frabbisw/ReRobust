@java.lang.Override
public void valueChange(org.vaadin.viritin.fields.MValueChangeEvent<com.dungeonstory.backend.data.ArmorType> event) {
    com.dungeonstory.backend.data.ArmorType currentarmorType = event.getValue();
    try {
        weight.setValue(((double) (currentarmorType.getBaseWeight())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
