@org.springframework.transaction.annotation.Transactional
public br.com.eits.missoes.domain.entity.User insertUser(br.com.eits.missoes.domain.entity.User user) {
    try {
        if ((user.getId()) == null) {
            user.setPassword(encoder.encodePassword(user.getPassword(), "saltOregon"));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return userRepository.saveAndFlush(user);
}
