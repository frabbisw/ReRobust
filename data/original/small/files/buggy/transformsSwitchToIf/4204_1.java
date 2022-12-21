@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    if (i == 0) {
        return new com.offsec.nethunter.DuckHunterFragment.DuckHunterConvertFragment();
    } else if (i == 1) {
        return new com.offsec.nethunter.DuckHunterFragment.DuckHunterPreviewFragment();
    } else {
        return new com.offsec.nethunter.DuckHunterFragment.DuckHunterReferenceFragment();
    }
}
