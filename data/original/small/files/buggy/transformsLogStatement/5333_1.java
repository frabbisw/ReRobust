public java.lang.String format(float f) {
    System.out.println("log");
    java.text.DecimalFormatSymbols s = new java.text.DecimalFormatSymbols();
    return myFormat.format(f).replace(",", " ");
}
