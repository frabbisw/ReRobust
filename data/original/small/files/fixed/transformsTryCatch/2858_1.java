protected void addConnection(java.util.List<de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vector2D> polygon, de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex lastVertex, de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex currentVertex) {
    de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vector2D vector = de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Factory.newVector2D(lastVertex, currentVertex);
    try {
        polygon.add(vector);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
