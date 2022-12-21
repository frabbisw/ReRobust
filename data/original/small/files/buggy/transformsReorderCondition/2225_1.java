@java.lang.Override
public int hashCode() {
    return (name.hashCode()) + ((metric.hashCode()) * 31);
}
