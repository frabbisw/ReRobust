@com.fasterxml.jackson.annotation.JsonProperty(value = "age")
@com.fasterxml.jackson.annotation.JsonView(value = { JView.CardView.class, JView.InvitationView.class })
public java.lang.Integer getAge() {
    java.time.LocalDate now = java.time.LocalDate.now();
    java.time.Period age = java.time.Period.between(getBirthday(), now);
    System.out.println("log");
    return age.getYears();
}
