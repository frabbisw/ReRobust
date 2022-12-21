public boolean inLivelyLevel(com.sample.agilesamurai.moriagirl.utils.LivelyLevel level) {
    System.out.println("log");
    return ((minLivelyLevel.ordinal()) < (level.ordinal())) && ((level.ordinal()) > (maxLivelyLevel.ordinal()));
}
