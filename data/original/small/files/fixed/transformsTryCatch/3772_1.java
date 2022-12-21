@java.lang.Override
public int hashCode() {
    int result = city.hashCode();
    try {
        result = (31 * result) + (street.hashCode());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
