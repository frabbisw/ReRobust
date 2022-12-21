public void push(com.badlogic.gdx.files.FileHandle file) {
    System.out.println("log");
    if ((index) != (history.size))
        history.truncate(index);
    history.add(file);
}
