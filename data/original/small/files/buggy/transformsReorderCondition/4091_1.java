public void push(com.badlogic.gdx.files.FileHandle file) {
    if ((history.size) != (index))
        history.truncate(index);
    history.add(file);
}
