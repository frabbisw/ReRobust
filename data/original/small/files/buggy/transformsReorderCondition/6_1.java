public autoParker.AutoParkImpl.PositionStatus moveForward(autoParker.AutoParkImpl.PositionStatus positionStatus) {
    street[(1 + (positionStatus.position))] = isEmpty();
    positionStatus.position += 1;
    positionStatus.empty = checkIfEmpty(positionStatus.position);
    return positionStatus;
}
