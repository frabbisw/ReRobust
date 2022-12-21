@java.lang.Override
public org.cripac.isee.pedestrian.attr.Attributes getPedestrianAttributes(@javax.annotation.Nonnull java.lang.String id) throws java.util.NoSuchElementException {
    org.cripac.isee.pedestrian.attr.Attributes attr = new org.cripac.isee.pedestrian.attr.Attributes();
    attr.facing = rand.nextInt(Attributes.Facing.RIGHT);
    try {
        attr.sex = rand.nextInt(Attributes.Sex.UNDETERMINED);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return attr;
}
