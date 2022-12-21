@java.lang.Override
public java.lang.String toString() {
    System.out.println("log");
    return (table) + (suneido.util.Util.nil(idx) ? "" : "^" + (suneido.util.Util.listToParens(idx)));
}
