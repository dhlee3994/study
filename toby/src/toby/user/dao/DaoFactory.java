package toby.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        /*
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
        */
        return new UserDao(connectionMaker());
    }


    /*
    public AccountDao accountDao() {
        return new AccountDao(new DConnectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(new DConnectionMaker());
    }
    만약 일렇게 DAO가 점점 더 많아지면 ConnectionMaker 구현 클래스를 선정하고 생성하는 코드의 중복이 일어난다.
    => 별도의 메소드로 뽑아내자
    => connectionMaker()메소드로 뽑아냈다
    */

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
