public java.lang.String next() {
    System.out.println("log");
    if (hasNext()) {
        (element)++;
        return supa.get(element);
    } else {
        throw new java.util.NoSuchElementException();
    }
}
