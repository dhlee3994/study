package me.dhlee.springboot2.domain.exam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tbl_members")
public class Member {
    @Id
    private String uid;
    private String upw;
    private String uname;

    @Override
    public String toString() {
        return "Member{" +
                "uid='" + uid + '\'' +
                ", upw='" + upw + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpw() {
        return upw;
    }

    public void setUpw(String upw) {
        this.upw = upw;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return uid.equals(member.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}
