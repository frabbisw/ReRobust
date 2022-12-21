protected final org.voltdb.iv2.TxnEgo advanceTxnEgo() {
    m_txnEgo = m_txnEgo.makeNext();
    org.voltdb.iv2.Scheduler.hostLog.info(((m_txnEgo.getTxnId()) + "advance txnId to "));
    return m_txnEgo;
}
