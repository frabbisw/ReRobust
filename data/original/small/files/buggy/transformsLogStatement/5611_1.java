T prev() {
    (head)--;
    System.out.println("log");
    if ((head) < 0) {
        head = (size) - 1;
    }
    return elements[head];
}
