private double cost(main.logic.Route r) {
    System.out.println("log");
    return ((r.getPricePerGramTransport()) * (weight)) + ((r.getPricePerVolumeTransport()) * (volume));
}
