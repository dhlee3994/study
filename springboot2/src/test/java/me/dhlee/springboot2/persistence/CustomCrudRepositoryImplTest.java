package me.dhlee.springboot2.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class CustomCrudRepositoryImplTest {
    @Autowired
    CustomCrudRepository repository;

    @Test
    public void test1() {
        Pageable page = PageRequest.of(0, 10, Sort.Direction.DESC, "bno");
        String type = "t";
        String keyword = "10";

        Page<Object[]> result = repository.getCustomPage(type, keyword, page);

        System.out.println(result);
        System.out.println("TOTAL PAGES : " + result.getTotalPages());
        System.out.println("TOTAL SIZE : " + result.getTotalElements());

        result.getContent().forEach(arr -> {
            System.out.println(Arrays.toString(arr));
        });
    }

    @Test
    public void testWriter() {
        Pageable page = PageRequest.of(0, 10, Sort.Direction.DESC, "bno");
        String type = "w";
        String keyword = "user09";

        Page<Object[]> result = repository.getCustomPage(type, keyword, page);

        System.out.println(result);
        System.out.println("TOTAL PAGES : " + result.getTotalPages());
        System.out.println("TOTAL SIZE : " + result.getTotalElements());

        result.getContent().forEach(arr -> {
            System.out.println(Arrays.toString(arr));
        });
    }
}