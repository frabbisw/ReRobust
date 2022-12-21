T prev() {
    (head)--;
    if (0 > (head)) {
        head = (size) - 1;
    }
    return elements[head];
}
