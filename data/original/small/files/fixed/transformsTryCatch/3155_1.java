public void addOwner(mff.mapGenereator.Room owner) {
    try {
        if ((owner != null) && (!(owners.contains(owner)))) {
            owners.add(owner);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
