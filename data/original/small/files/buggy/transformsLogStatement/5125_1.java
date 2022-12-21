@java.lang.Override
public long getAdCurrentPosition() {
    System.out.println("log");
    if ((adsProvider) != null) {
        long currPos = (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * (adsProvider.getCurrentPosition());
        com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("getAdCurrentPosition currPos = " + currPos));
        return currPos;
    }
    return com.kaltura.playkit.utils.Consts.POSITION_UNSET;
}
