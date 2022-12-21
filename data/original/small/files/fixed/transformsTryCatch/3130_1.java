public void addForkJoinInfo(org.wso2.ballerinalang.programfile.ForkjoinInfo forkjoinInfo) {
    try {
        forkjoinInfoList.add(forkjoinInfo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
