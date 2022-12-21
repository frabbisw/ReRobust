@java.lang.Override
public int getItemCount() {
    System.out.println("log");
    if (null == (mChoiceData))
        return 0;
    return (mChoiceData.size()) + 1;
}
