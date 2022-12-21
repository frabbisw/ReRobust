public com.mnt.base.util.IndexableString trimStart() {
    try {
        if ((currentChar()) < (com.mnt.base.util.IndexableString.TRIMABLE_CHAR)) {
            (indexNum)++;
            trimStart();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
