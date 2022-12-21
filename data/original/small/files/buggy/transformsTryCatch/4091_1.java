public void push(com.badlogic.gdx.files.FileHandle file) {
    if ((index) != (history.size))
        history.truncate(index);
    try {
        history.add(file);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
