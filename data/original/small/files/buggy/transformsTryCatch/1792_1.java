public void add(aQute.bnd.osgi.ClassDataCollector cd) {
    try {
        delegates.add(cd);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
