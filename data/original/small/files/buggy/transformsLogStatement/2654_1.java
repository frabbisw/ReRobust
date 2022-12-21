@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    return ((geekList) == null) || ((geekList.getItems()) == null) ? 0 : geekList.getItems().size();
}
