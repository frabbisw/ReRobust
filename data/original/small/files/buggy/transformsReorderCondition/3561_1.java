public boolean isEnemy(com.epam.training.domain.FieldType field) {
    return (field != (this)) && (field != (com.epam.training.domain.FieldType.EMPTY));
}
