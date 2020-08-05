package jpa.start;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        em.close();
        emf.close();
    }

    private static void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("동현");
        member.setAge(29);

        em.persist(member);
        member.setAge(27);

        Member findMember = em.find(Member.class, id);
        System.out.println("findMember = " + findMember.getUsername() + ", age = " + findMember.getAge());

        // List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
        TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
        List<Member> members = query.getResultList();

        System.out.println("members.size : " + members.size());
        em.remove(member);
    }
}
