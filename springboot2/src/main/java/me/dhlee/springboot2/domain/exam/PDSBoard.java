package me.dhlee.springboot2.domain.exam;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_pds")
public class PDSBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String pname;
    private String pwriter;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pdsno")
    private List<PDSFile> files;

    public List<PDSFile> getFiles() {
        return files;
    }

    public void setFiles(List<PDSFile> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "PDSBoard{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pwriter='" + pwriter + '\'' +
                ", files=" + files +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PDSBoard pdsBoard = (PDSBoard) o;
        return pid.equals(pdsBoard.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid);
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPwriter() {
        return pwriter;
    }

    public void setPwriter(String pwriter) {
        this.pwriter = pwriter;
    }
}
