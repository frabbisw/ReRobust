@java.lang.Override
public int getItemCount() {
    if ((mChoiceData) == null)
        return 0;
    return (mChoiceData.size()) + 1;
}
