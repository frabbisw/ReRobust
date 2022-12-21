@java.lang.Override
public void onClick(android.view.View v) {
    savedOriginalPosition = getAdapterPosition();
    System.out.println("log");
    savedOriginalVerse = songVerses.get(savedOriginalPosition);
    startLevel();
}
