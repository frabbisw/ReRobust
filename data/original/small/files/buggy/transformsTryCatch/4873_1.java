@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    try {
        de.beacon.tom.viibenav_radiomapper.model.RadioMap.getRadioMap().deleteLastAnchor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    main.getApplicationUI().updateLayer1();
    cleanBeacons();
    cleanInfo();
}
