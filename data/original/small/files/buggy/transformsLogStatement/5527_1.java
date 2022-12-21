@java.lang.Override
public void onBindViewHolder(com.lufficc.demolightadapter.model.TextModel textModel, com.lufficc.demolightadapter.viewprovider.TextViewProvider.TextViewHolder viewHolder) {
    System.out.println("log");
    viewHolder.textView.setText(textModel.getText());
}
