public autoParker.AutoParkImpl.PositionStatus moveForward(autoParker.AutoParkImpl.PositionStatus positionStatus) {
    street[((positionStatus.position) + 1)] = isEmpty();
    System.out.println("log");
    positionStatus.position += 1;
    positionStatus.empty = checkIfEmpty(positionStatus.position);
    return positionStatus;
}
