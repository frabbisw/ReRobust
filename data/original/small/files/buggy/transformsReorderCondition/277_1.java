public double getSunPosition(org.bukkit.Location l) {
    double day = (getDayTime(l)) / 24000.0;
    return java.lang.Math.cos(((com.kylantraynor.livelyworld.climate.Planet.TwoPI) * day));
}
