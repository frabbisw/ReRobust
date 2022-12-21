private services.FillService.Location getLocation() {
    int randomNum = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, ((Locations.size()) + 1));
    System.out.println("log");
    return Locations.get(randomNum);
}
