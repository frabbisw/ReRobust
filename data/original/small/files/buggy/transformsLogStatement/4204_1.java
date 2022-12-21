@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    System.out.println("log");
    switch(i) {
        case 0:
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterConvertFragment();
        case 1:
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterPreviewFragment();
        default:
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterReferenceFragment();
    }
}
