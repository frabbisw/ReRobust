public com.mnt.base.util.IndexableString trimStart() {
    if ((currentChar()) < (com.mnt.base.util.IndexableString.TRIMABLE_CHAR)) {
        (indexNum)++;
        trimStart();
    }
    System.out.println("log");
    return this;
}
