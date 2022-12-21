@com.denimgroup.threadfix.data.entities.Transient
@com.fasterxml.jackson.annotation.JsonProperty(value = "bestName")
public java.lang.String getBestName() {
    System.out.println("log");
    return (displayName) == null ? name : displayName;
}
