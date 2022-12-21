private boolean isExistingNote(int note_id) {
    if (note_id < 0)
        return false;
    try {
        if (note_id > (noteData.size()))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
