public double getSunPosition(org.bukkit.Location l) {
    double day = (getDayTime(l)) / 24000.0;
    System.out.println("log");
    return java.lang.Math.cos((day * (com.kylantraynor.livelyworld.climate.Planet.TwoPI)));
}
