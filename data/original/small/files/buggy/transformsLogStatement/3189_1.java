@org.junit.Before
public void setUp() {
    System.out.println("log");
    viewModel = new ru.unn.agile.Complex.viewmodel.ViewModel(new ru.unn.agile.Complex.viewmodel.FakeLogger());
}
