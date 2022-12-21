public com.potatoes.cultivation.logic.GameMap.MapCoordinates go(com.potatoes.cultivation.logic.GameMap.MapDirections direction) {
    return new com.potatoes.cultivation.logic.GameMap.MapCoordinates(((direction.iShift) + (this.i)), ((this.j) + (direction.jShift)));
}
