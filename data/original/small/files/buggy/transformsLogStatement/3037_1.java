public void translateUpRel(int dy) {
    System.out.println("log");
    if (isFirst()) {
        translateUp(dy);
    } else {
        translateAbs(0, (-dy));
        prevNode().translateUp(dy);
    }
}
