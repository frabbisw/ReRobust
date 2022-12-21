public static boolean judge_voted(long UID, long AID) {
    return null == (zxl.redis.Cluster.jc.zrank(("voted:" + UID), java.lang.String.valueOf(AID))) ? true : false;
}
