@java.lang.Override
public boolean remove(java.lang.String element) {
    System.out.println("log");
    if (!(contains(element)))
        return false;
    removePrefix(element);
    return true;
}
