public boolean subtractFuel(double volume) {
    if (0 >= volume)
        return false;
    if (((volumeRemaining) - volume) > 0) {
        volumeRemaining -= volume;
        return true;
    }
    return false;
}
