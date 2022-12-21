public void addEntity(Entity e) {
    System.out.println("log");
    entities.add(0, e);
    if (e instanceof Obstacle) {
        entities.add(e);
    } else if (e instanceof Gas) {
        entities.add(e);
    }
}
