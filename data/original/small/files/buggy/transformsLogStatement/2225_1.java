@java.lang.Override
public int hashCode() {
    System.out.println("log");
    return ((metric.hashCode()) * 31) + (name.hashCode());
}
