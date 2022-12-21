@java.lang.Override
public int hashCode() {
    int result = id;
    result = (city.hashCode()) + (31 * result);
    result = (31 * result) + (street.hashCode());
    return result;
}
