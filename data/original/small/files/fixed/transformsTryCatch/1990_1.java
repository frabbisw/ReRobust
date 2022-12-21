public void msg(long time) {
    try {
        msgs.add(new tterrag.tppibot.reactions.FloodSpam.MessageCount.Message(time));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
