private void onScreenOn() {
    if ((Build.VERSION_CODES.ECLAIR_MR1) <= (java.lang.Integer.parseInt(Build.VERSION.SDK)))
        org.wahtod.wififixer.prefs.PrefUtil.writeBoolean(this, org.wahtod.wififixer.WifiFixerService.SCREENOFF, false);
    org.wahtod.wififixer.WifiFixerService.screenstate = true;
}
