@org.junit.Test
public void ElfoVerdeAtiraFlechaERecebe2deXP() {
    ElfosVerdes teste = new ElfosVerdes("Arthur");
    teste.atirarFlechaDeVidro(new Dwarf());
    System.out.println("log");
    assertEquals(2, teste.getExperiencia());
}
