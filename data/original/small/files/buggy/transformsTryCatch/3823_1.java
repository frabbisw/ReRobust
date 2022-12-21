@org.springframework.transaction.annotation.Transactional
public ua.in.ngo.ednist.self.SelfInfo getSelfInfo() {
    ua.in.ngo.ednist.self.SelfInfo info = selfInfoDao.getSelfInfo();
    try {
        info.setLogoPath("/resources/self/logo/logo.png");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return info;
}
