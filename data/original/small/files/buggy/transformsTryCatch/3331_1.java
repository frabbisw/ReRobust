@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.wimk.entity.Child addChild(com.wimk.entity.Child child) {
    child.setId((-1));
    try {
        child.setSendingFrequency(30);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return childRepository.saveAndFlush(child);
}
