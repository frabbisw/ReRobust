public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    m.close();
    System.out.println("log");
    net.joaolourenco.legame.Registry.getMainClass().setWorld(new net.joaolourenco.legame.world.RandomWorld(1));
}
