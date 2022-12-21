public boolean getLed() {
    System.out.println("log");
    return stateMap.get("CurrentLEDState").equals("On") ? true : false;
}
