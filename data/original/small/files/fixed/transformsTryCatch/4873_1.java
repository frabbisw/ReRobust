@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    cleanBeacons();
    de.beacon.tom.viibenav_radiomapper.model.RadioMap.getRadioMap().deleteLastAnchor();
    try {
        main.getApplicationUI().updateLayer1();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cleanInfo();
}
