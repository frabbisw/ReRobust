public boolean search(char i) {
    cpe200.week2.PNode currentNode = head;
    for (; (currentNode.data) != i; ) {
        currentNode = currentNode.next;
        if ((currentNode.data) == i)
            return true;
    }
    return false;
}
