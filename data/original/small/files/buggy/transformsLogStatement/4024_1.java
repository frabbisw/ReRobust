public void onClick(android.content.DialogInterface dialog, int id) {
    android.app.FragmentTransaction fm = getFragmentManager().beginTransaction();
    System.out.println("log");
    fm.replace(R.id.fragment_container, new finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment());
    fm.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    fm.commit();
}
