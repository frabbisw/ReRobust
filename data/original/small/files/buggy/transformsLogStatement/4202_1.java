@java.lang.Override
public void valueChange(org.vaadin.viritin.fields.MValueChangeEvent<com.dungeonstory.backend.data.ArmorType> event) {
    System.out.println("log");
    com.dungeonstory.backend.data.ArmorType currentarmorType = event.getValue();
    weight.setValue(((double) (currentarmorType.getBaseWeight())));
}
