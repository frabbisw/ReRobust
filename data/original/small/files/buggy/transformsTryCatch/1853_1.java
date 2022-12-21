public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    m.close();
    try {
        net.joaolourenco.legame.Registry.getMainClass().setWorld(new net.joaolourenco.legame.world.RandomWorld(1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
