@java.lang.Override
public void onClick(android.view.View v) {
    savedOriginalPosition = getAdapterPosition();
    try {
        savedOriginalVerse = songVerses.get(savedOriginalPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startLevel();
}
