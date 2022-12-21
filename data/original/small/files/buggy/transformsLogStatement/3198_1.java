@java.lang.Override
protected void onNfcStateEnabled() {
    System.out.println("log");
    nfcAvalability = org.kemerelab.rsmcontrol.NFCWriteActivity.NFCAvalability.AVAILABLE_ENABLED;
}
