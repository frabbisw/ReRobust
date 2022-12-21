public int getGID(int cid) {
    if (isIdentity) {
        return cid;
    } else {
        if ((mapping.length) > cid) {
            return mapping[cid];
        } else {
            return 0;
        }
    }
}
