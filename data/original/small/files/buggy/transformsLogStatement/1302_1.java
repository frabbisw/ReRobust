public void addedToEngine(com.badlogic.ashley.core.Engine e) {
    System.out.println("log");
    for (com.badlogic.ashley.core.Entity add : e.getEntitiesFor(Families.GRAVITY_ATTRACTED)) entities().add(add);
}
