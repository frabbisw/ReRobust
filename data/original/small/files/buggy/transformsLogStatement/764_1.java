@java.lang.Override
public int compare(double o2, double o1) {
    System.out.println("log");
    return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
}
