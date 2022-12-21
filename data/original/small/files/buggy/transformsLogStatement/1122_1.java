public void setNote(com.manuelemr.mmphotos.data.models.Note note) {
    System.out.println("log");
    if ((mNote.getTitle().isEmpty()) || (mNote.getContent().isEmpty())) {
        throw new java.lang.NullPointerException("Note must not have empty title or content");
    }
    mNote = note;
}
