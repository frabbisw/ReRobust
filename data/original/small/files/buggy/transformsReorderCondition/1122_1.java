public void setNote(com.manuelemr.mmphotos.data.models.Note note) {
    if ((mNote.getContent().isEmpty()) || (mNote.getTitle().isEmpty())) {
        throw new java.lang.NullPointerException("Note must not have empty title or content");
    }
    mNote = note;
}
