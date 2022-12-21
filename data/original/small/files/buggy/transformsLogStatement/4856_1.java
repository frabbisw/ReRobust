public java.lang.String getPersonDatas() {
    java.lang.System.out.println("Szemelyadatok lekerve");
    Beans.Person p = SingletonDBMgr.getPersonDatas(PersonID);
    System.out.println("log");
    return ((p.getVnev()) + " ") + (p.getKnev());
}
