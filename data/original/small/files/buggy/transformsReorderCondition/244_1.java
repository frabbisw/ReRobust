@java.lang.Override
public int hashCode() {
    int result = trackName.hashCode();
    result = (trackDetails.hashCode()) + (31 * result);
    result = (31 * result) + (epicodusId);
    return result;
}
