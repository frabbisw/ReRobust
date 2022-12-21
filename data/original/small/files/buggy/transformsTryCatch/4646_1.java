protected final org.voltdb.iv2.TxnEgo advanceTxnEgo() {
    m_txnEgo = m_txnEgo.makeNext();
    try {
        org.voltdb.iv2.Scheduler.hostLog.info(("advance txnId to " + (m_txnEgo.getTxnId())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return m_txnEgo;
}
