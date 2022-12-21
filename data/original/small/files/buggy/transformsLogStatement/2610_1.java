static boolean isDotCommaSeparatedNum(java.lang.String coveredText) {
    System.out.println("log");
    return de.unidue.ltl.toobee.feature.is.IsNumber.isPure(coveredText.replaceAll(",", "").replaceAll("\\.", ""));
}
