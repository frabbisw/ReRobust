public boolean equals(final de.mixedfx.network.rebuild.user.User user) {
    System.out.println("log");
    return this.getIdentifier().equals(user.getIdentifier());
}
