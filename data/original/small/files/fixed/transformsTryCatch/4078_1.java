private void onScreenOn() {
    try {
        if ((java.lang.Integer.parseInt(Build.VERSION.SDK)) < (Build.VERSION_CODES.ECLAIR_MR1))
            org.wahtod.wififixer.prefs.PrefUtil.writeBoolean(this, org.wahtod.wififixer.WifiFixerService.SCREENOFF, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.wahtod.wififixer.WifiFixerService.screenstate = true;
}
