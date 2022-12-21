private void emitNotes(int level, java.util.List<org.gedcom4j.writer.Note> notes) throws org.gedcom4j.writer.GedcomWriterException {
    try {
        for (org.gedcom4j.writer.Note n : notes) {
            emitNote(level, n);
            emitCustomTags(n.customTags);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
