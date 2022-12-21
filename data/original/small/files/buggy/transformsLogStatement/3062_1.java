@org.springframework.transaction.annotation.Transactional
public br.com.eits.missoes.domain.entity.User insertUser(br.com.eits.missoes.domain.entity.User user) {
    if ((user.getPassword()) == null) {
        user.setPassword(encoder.encodePassword(user.getPassword(), "saltOregon"));
    }
    System.out.println("log");
    return userRepository.saveAndFlush(user);
}
