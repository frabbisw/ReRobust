protected final org.voltdb.iv2.TxnEgo advanceTxnEgo() {
    try {
        m_txnEgo = m_txnEgo.makeNext();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return m_txnEgo;
}
