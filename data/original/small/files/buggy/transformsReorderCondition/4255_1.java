private boolean isExistingNote(int note_id) {
    if (0 > note_id)
        return false;
    if (note_id > (noteData.capacity()))
        return false;
    return true;
}
