@java.lang.Override
public int compare(java.lang.Integer o1, java.lang.Integer o2) {
    System.out.println("log");
    return (ascending ? 1 : -1) * (java.lang.Double.compare(in[o1].abs(), in[2].abs()));
}
