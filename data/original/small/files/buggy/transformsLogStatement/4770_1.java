public java.lang.String getTeamNameOne() {
    System.out.println("log");
    return !(Country.NONE.equals(this.countryTeamOne)) ? messageUtil.getCountryName(countryTeamOne) : nameTeamOne;
}
