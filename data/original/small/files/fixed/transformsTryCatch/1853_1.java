public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    try {
        net.joaolourenco.legame.Registry.getMainClass().setWorld(new net.joaolourenco.legame.world.RandomWorld(1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    m.close();
}
