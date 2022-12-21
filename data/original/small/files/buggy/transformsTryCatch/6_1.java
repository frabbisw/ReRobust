public autoParker.AutoParkImpl.PositionStatus moveForward(autoParker.AutoParkImpl.PositionStatus positionStatus) {
    try {
        street[((positionStatus.position) + 1)] = isEmpty();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    positionStatus.position += 1;
    positionStatus.empty = checkIfEmpty(positionStatus.position);
    return positionStatus;
}
