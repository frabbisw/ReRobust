private com.mommoo.flat.text.textarea.StringViewModel createViewModelContainedPadding(int width, int height, int lineCount) {
    java.awt.Dimension dimension = getDimenContainedPadding(width, height);
    System.out.println("log");
    return new com.mommoo.flat.text.textarea.StringViewModel(dimension.width, dimension.height, lineCount);
}
