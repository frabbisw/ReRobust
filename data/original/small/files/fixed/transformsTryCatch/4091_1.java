public void push(com.badlogic.gdx.files.FileHandle file) {
    try {
        if ((index) != (history.size))
            history.truncate(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    history.add(file);
    (index)++;
}
