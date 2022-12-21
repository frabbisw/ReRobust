@java.lang.Override
public void onBindViewHolder(com.lufficc.demolightadapter.model.TextModel textModel, com.lufficc.demolightadapter.viewprovider.TextViewProvider.TextViewHolder viewHolder) {
    try {
        viewHolder.textView.setText(textModel.getText());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
