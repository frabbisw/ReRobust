public com.mnt.base.util.IndexableString trimStart() {
    if ((com.mnt.base.util.IndexableString.TRIMABLE_CHAR) > (currentChar())) {
        (indexNum)++;
        trimStart();
    }
    return this;
}
