@java.lang.Override
public boolean getMoreResults() throws java.sql.SQLException {
    com.alibaba.druid.filter.FilterChainImpl chain = createChain();
    boolean value = chain.statement_getMoreResults(this);
    if (value) {
        updateCount = null;
    }
    try {
        recycleFilterChain(chain);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return value;
}
