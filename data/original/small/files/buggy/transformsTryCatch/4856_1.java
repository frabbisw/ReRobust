public java.lang.String getPersonDatas() {
    try {
        java.lang.System.out.println("Szemelyadatok lekerve");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Beans.Person p = SingletonDBMgr.getPersonDatas(PersonID);
    return ((p.getVnev()) + " ") + (p.getKnev());
}
