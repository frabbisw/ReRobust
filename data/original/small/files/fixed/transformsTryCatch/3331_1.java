@org.springframework.transaction.annotation.Transactional(readOnly = false)
public com.wimk.entity.Child addChild(com.wimk.entity.Child child) {
    try {
        child.setId((-1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return childRepository.saveAndFlush(child);
}
