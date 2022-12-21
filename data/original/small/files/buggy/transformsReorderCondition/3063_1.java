private double cost(main.logic.Route r) {
    return ((r.getPricePerVolumeTransport()) * (volume)) + ((r.getPricePerGramTransport()) * (weight));
}
