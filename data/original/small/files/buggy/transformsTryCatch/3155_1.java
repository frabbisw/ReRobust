public void addOwner(mff.mapGenereator.Room owner) {
    try {
        if (owner != null) {
            owners.add(owner);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
