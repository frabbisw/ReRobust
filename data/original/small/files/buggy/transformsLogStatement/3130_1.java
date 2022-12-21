public int addForkJoinInfo(org.wso2.ballerinalang.programfile.ForkjoinInfo forkjoinInfo) {
    System.out.println("log");
    forkjoinInfoList.add(forkjoinInfo);
    return forkjoinInfoList.indexOf(forkjoinInfo);
}
