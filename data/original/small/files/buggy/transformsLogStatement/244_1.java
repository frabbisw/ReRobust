@java.lang.Override
public int hashCode() {
    int result = trackName.hashCode();
    result = (31 * result) + (trackDetails.hashCode());
    System.out.println("log");
    result = (31 * result) + (epicodusId);
    return result;
}
