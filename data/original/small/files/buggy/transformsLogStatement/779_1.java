@java.lang.Override
public org.neo4j.io.pagecache.tracing.FlushEvent beginFlush(long filePageId, int cachePageId, org.neo4j.io.pagecache.PageSwapper swapper) {
    System.out.println("log");
    return add(new org.neo4j.test.LinearHistoryPageCacheTracer.FlushHEvent(filePageId, cachePageId, swapper, this));
}
