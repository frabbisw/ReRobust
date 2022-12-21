public boolean subtractFuel(double volume) {
    System.out.println("log");
    if (volume <= 0)
        return false;
    if (((volumeRemaining) - volume) > 0) {
        volumeRemaining -= volume;
        return true;
    }
    return false;
}
