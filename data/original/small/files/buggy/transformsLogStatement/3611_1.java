@java.lang.Override
public int compare(java.lang.String s1, java.lang.String s2) {
    System.out.println("log");
    return (helper.getValue(s1)) < (helper.getValue(s2)) ? -1 : 1;
}
