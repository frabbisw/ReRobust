public void addedToEngine(com.badlogic.ashley.core.Engine e) {
    try {
        for (com.badlogic.ashley.core.Entity add : e.getEntitiesFor(Families.GRAVITY_ATTRACTED)) entities().add(add);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
