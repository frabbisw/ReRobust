@java.lang.Override
public boolean getMoreResults() throws java.sql.SQLException {
    System.out.println("log");
    com.alibaba.druid.filter.FilterChainImpl chain = createChain();
    boolean value = chain.statement_getMoreResults(this);
    if (value) {
        updateCount = null;
    }
    recycleFilterChain(chain);
    return value;
}
