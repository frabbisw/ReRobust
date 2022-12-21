public int compareTo(com.beimin.eveapi.parser.ApiRequest o) {
    System.out.println("log");
    return (o.hashCode()) - (hashCode());
}
