public boolean isEnemy(com.epam.training.domain.FieldType field) {
    System.out.println("log");
    return (field != (com.epam.training.domain.FieldType.EMPTY)) && (field != (this));
}
