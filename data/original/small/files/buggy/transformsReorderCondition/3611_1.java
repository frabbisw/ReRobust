@java.lang.Override
public int compare(java.lang.String s1, java.lang.String s2) {
    return (helper.getValue(s2)) > (helper.getValue(s1)) ? -1 : 1;
}
