public static void populateWorld() {
    System.out.println("log");
    for (assignment4.Critter c : assignment4.CritterWorld.getLivingCritters()) {
        c.hasMoved = false;
        assignment4.CritterWorld.getWorld()[c.x_coord][c.y_coord] = c;
    }
}
