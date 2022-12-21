@java.lang.Override
public long getAdCurrentPosition() {
    try {
        if ((adsProvider) != null) {
            long currPos = (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * (adsProvider.getCurrentPosition());
            com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("getAdCurrentPosition currPos = " + currPos));
            return currPos;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.kaltura.playkit.utils.Consts.POSITION_UNSET;
}
