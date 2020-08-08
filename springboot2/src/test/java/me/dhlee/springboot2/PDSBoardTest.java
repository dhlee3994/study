package me.dhlee.springboot2;


import me.dhlee.springboot2.domain.PDSBoard;
import me.dhlee.springboot2.domain.PDSFile;
import me.dhlee.springboot2.persistence.PDSBoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class PDSBoardTest {
    @Autowired
    PDSBoardRepository repo;

    @Test
    public void testInsertPDS() {
        PDSBoard pds = new PDSBoard();
        pds.setPname("DOCUMENT 1 - 2");

        PDSFile file1 = new PDSFile();
        file1.setPdsfile("file1.doc");

        PDSFile file2 = new PDSFile();
        file2.setPdsfile("file2.doc");

        pds.setFiles(Arrays.asList(file1, file2));

        repo.save(pds);
    }

    @Test
    @Transactional
    public void testUpdateFileName1() {
        Long fno = 1L;
        String newFileName = "updateFile1.doc";
        int count = repo.udpatePDSFile(fno, newFileName);
        System.out.println(count);
    }

    @Test
    @Transactional
    public void testUpdateFileName2() {
        String newFileName = "updateFile2.doc";
        Optional<PDSBoard> result = repo.findById(2L);
        result.ifPresent(pds -> {
            PDSFile target = new PDSFile();
            target.setFno(2L);
            target.setPdsfile(newFileName);

            int idx = pds.getFiles().indexOf(target);
            if (idx > -1) {
                List<PDSFile> list = pds.getFiles();
                list.remove(idx);
                list.add(target);
                pds.setFiles(list);
            }

            repo.save(pds);
        });
    }

    @Test
    @Transactional
    public void testDeletePDSFile() {
        Long fno = 2L;
        int count = repo.deletePDSFile(fno);
        System.out.println(count);
    }

    @Test
    public void insertDummies() {
        List<PDSBoard> list = new ArrayList<>();
        IntStream.range(1, 100).forEach(i -> {
            PDSBoard pds = new PDSBoard();
            pds.setPname("자료 " + i);

            PDSFile file1 = new PDSFile();
            file1.setPdsfile("file1.doc");

            PDSFile file2 = new PDSFile();
            file2.setPdsfile("file2.doc");

            pds.setFiles(Arrays.asList(file1, file2));
            list.add(pds);
        });

        repo.saveAll(list);
    }

    @Test
    public void viewSummary() {
        repo.getSummary().forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}
