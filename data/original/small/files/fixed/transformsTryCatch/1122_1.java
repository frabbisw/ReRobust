public void setNote(com.manuelemr.mmphotos.data.models.Note note) {
    try {
        if ((note.getTitle().isEmpty()) || (note.getContent().isEmpty())) {
            throw new java.lang.NullPointerException("Note must not have empty title or content");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mNote = note;
}
