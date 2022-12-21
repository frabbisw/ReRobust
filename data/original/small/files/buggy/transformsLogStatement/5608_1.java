public org.usfirst.frc.team1699.utils.inireader.ConfigLine<?> getLine(int index) {
    System.out.println("log");
    try {
        return new org.usfirst.frc.team1699.utils.inireader.ConfigLine(this.lines.get(index));
    } catch (java.lang.IndexOutOfBoundsException e) {
        throw new org.usfirst.frc.team1699.utils.inireader.NotFoundException("Provided index was out of bounds.");
    }
}
