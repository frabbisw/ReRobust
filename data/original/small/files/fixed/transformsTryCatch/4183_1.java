@java.lang.Override
public void onPageSelected(int position) {
    net.raysuhyunlee.avant_garde.FingersFragment item = ((net.raysuhyunlee.avant_garde.FingersFragment) (adapter.getItem(position)));
    net.raysuhyunlee.avant_garde.DB.Situation situation = item.situation;
    try {
        sendSituation(situation, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
