protected final org.voltdb.iv2.TxnEgo advanceTxnEgo() {
    m_txnEgo = m_txnEgo.makeNext();
    System.out.println("log");
    org.voltdb.iv2.Scheduler.hostLog.info(("advance txnId to " + (m_txnEgo.getTxnId())));
    return m_txnEgo;
}
