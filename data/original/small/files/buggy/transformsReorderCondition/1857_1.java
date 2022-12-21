public boolean search(char i) {
    cpe200.week2.PNode currentNode = head;
    while (i != (currentNode.data)) {
        currentNode = currentNode.next;
        if ((currentNode.data) == i)
            return true;
    }
    return false;
}
