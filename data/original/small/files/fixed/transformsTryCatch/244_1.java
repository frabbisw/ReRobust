@java.lang.Override
public int hashCode() {
    int result = trackName.hashCode();
    try {
        result = (31 * result) + (trackDetails.hashCode());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}