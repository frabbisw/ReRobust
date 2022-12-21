@java.lang.Override
public boolean equals(java.lang.Object user) {
    try {
        if (user instanceof de.mixedfx.network.rebuild.user.User)
            return this.getIdentifier().equals(((de.mixedfx.network.rebuild.user.User) (user)).getIdentifier());
        else
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
