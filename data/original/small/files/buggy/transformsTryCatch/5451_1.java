@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    try {
        m_CurrentValue = holderQtyEntered.getText();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    m_CurrentPosition = position;
    m_CurrentLineNetAmt = tv_LineNetAmt;
    m_CurrentRecordItem = recordItem;
}
