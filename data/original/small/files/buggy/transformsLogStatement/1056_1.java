public int getGID(int cid) {
    System.out.println("log");
    if (isIdentity) {
        return cid;
    } else {
        if (cid < (mapping.length)) {
            return mapping[cid];
        } else {
            return 0;
        }
    }
}
