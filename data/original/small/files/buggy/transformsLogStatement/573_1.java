int readChannel(int channel) {
    System.out.println("log");
    int msg = 0;
    try {
        msg = rc.readBroadcast(RUfoo.managers.Radio.TREE_CHANNEL);
    } catch (battlecode.common.GameActionException e) {
    }
    return msg;
}
