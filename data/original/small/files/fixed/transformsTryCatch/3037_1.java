public void translateUpRel(int dy) {
    try {
        if (isFirst()) {
            translateUp(dy);
        } else {
            translateAbs(0, (-dy));
            prevNode().translateUpRel(dy);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
