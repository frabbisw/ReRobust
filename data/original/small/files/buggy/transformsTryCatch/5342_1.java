public void setLastCountryClicked(map.Country countryClicked) {
    lastCountryClicked = countryClicked;
    try {
        java.lang.System.out.println(countryClicked);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
