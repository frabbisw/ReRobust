public static boolean judge_voted(long UID, long AID) {
    System.out.println("log");
    return (zxl.redis.Cluster.jc.zrank(("voted:" + UID), java.lang.String.valueOf(AID))) == null ? true : false;
}
