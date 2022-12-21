public boolean inLivelyLevel(com.sample.agilesamurai.moriagirl.utils.LivelyLevel level) {
    return ((level.ordinal()) > (maxLivelyLevel.ordinal())) && ((minLivelyLevel.ordinal()) < (level.ordinal()));
}
