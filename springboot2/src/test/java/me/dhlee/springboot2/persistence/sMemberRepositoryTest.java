package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.MemberRole;
import me.dhlee.springboot2.domain.Members;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class sMemberRepositoryTest {
    @Autowired
    sMemberRepository repository;

    @Test
    public void testInsert() {
        for (int i = 0; i <= 100; i++) {
            Members m = new Members();
            m.setUid("user" + i);
            m.setUpw("pw" + i);
            m.setUname("사용자" + i);

            MemberRole role = new MemberRole();
            if (i <= 80) {
                role.setRoleName("BASIC");
            } else if (i <= 90) {
                role.setRoleName("MANAGER");
            } else {
                role.setRoleName("ADMIN");
            }

            m.setRoles(Arrays.asList(role));
            repository.save(m);
        }
    }

    @Test
    public void testRead() {
        Optional<Members> result = repository.findById("user85");
        result.ifPresent(members -> System.out.println("members : " + members));

    }
}