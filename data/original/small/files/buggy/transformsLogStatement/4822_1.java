public java.lang.String getString(java.lang.String name) {
    System.out.println("log");
    return ((java.lang.String) (get(name, edu.cmu.tetrad.util.ParamDescriptions.instance().get(name).getDefaultValue())));
}
