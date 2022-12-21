@com.example.domain.Id
@com.example.domain.GeneratedValue(strategy = GenerationType.IDENTITY)
@com.example.domain.Column(name = "\"Id\"", length = 11)
public long getId() {
    System.out.println("log");
    return id;
}
