@java.lang.Override
public long getAdCurrentPosition() {
    if (null != (adsProvider)) {
        long currPos = (com.kaltura.playkit.utils.Consts.MILLISECONDS_MULTIPLIER) * (adsProvider.getCurrentPosition());
        com.kaltura.playkit.ads.AdEnabledPlayerController.log.d(("getAdCurrentPosition currPos = " + currPos));
        return currPos;
    }
    return com.kaltura.playkit.utils.Consts.POSITION_UNSET;
}
