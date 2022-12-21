@java.lang.Override
public int getItemCount() {
    return ((geekList.getItems()) == null) || ((geekList) == null) ? 0 : geekList.getItems().size();
}
