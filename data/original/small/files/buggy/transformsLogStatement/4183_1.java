@java.lang.Override
public void onPageSelected(int position) {
    net.raysuhyunlee.avant_garde.FingersFragment item = ((net.raysuhyunlee.avant_garde.FingersFragment) (adapter.getItem(position)));
    System.out.println("log");
    net.raysuhyunlee.avant_garde.DB.Situation situation = item.situation;
    sendSituation(situation);
}
