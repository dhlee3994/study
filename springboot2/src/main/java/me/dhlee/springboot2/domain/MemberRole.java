package me.dhlee.springboot2.domain;

import javax.persistence.*;

@Entity
@Table(name = "tbl_member_roles")
public class MemberRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fno;
    private String roleName;

    @Override
    public String toString() {
        return "MemberRole{" +
                "fno=" + fno +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public Long getFno() {
        return fno;
    }

    public void setFno(Long fno) {
        this.fno = fno;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
