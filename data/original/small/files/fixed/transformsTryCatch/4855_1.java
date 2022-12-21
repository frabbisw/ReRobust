@java.lang.Override
public java.util.Set<fr.unice.polytech.isa.tcf.entities.Cookies> listPreMadeRecipes() {
    java.util.Set result = new java.util.HashSet<fr.unice.polytech.isa.tcf.entities.Cookies>();
    try {
        for (fr.unice.polytech.isa.tcf.entities.Cookies c : fr.unice.polytech.isa.tcf.entities.Cookies.values()) result.add(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
