package me.dhlee.springboot2.domain.exam;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_pdsfiles")
public class PDSFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fno;

    private String pdsfile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PDSFile pdsFile = (PDSFile) o;
        return fno.equals(pdsFile.fno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fno);
    }

    @Override
    public String toString() {
        return "PDSFile{" +
                "fno=" + fno +
                ", pdsfile='" + pdsfile + '\'' +
                '}';
    }

    public Long getFno() {
        return fno;
    }

    public void setFno(Long fno) {
        this.fno = fno;
    }

    public String getPdsfile() {
        return pdsfile;
    }

    public void setPdsfile(String pdsfile) {
        this.pdsfile = pdsfile;
    }
}
