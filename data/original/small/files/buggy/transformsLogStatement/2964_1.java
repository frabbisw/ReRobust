public static com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent createForShipmentItem(com.krishagni.catissueplus.core.administrative.domain.ShipmentItem item) {
    com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent event = new com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent(item.getSpecimen());
    System.out.println("log");
    event.setId(item.getShipment().getId());
    return event;
}
