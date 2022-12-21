@org.springframework.transaction.annotation.Transactional
public br.com.eits.missoes.domain.entity.User insertUser(br.com.eits.missoes.domain.entity.User user) {
    if (null == (user.getPassword())) {
        user.setPassword(encoder.encodePassword(user.getPassword(), "saltOregon"));
    }
    return userRepository.saveAndFlush(user);
}
