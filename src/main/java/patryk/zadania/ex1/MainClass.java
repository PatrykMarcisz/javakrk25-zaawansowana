package patryk.zadania.ex1;

public class MainClass {
    public static void main(String[] args) {
        Member m1 = new Member("Patryk", "p@m.pl");
        System.out.println(m1.getId());
        Member m2 = new Member("Alan", "a@m.pl");
        System.out.println(m2.getId());
        Member m3 = new Member("Natalia", "n@m.pl");
        System.out.println(m3.getId());
        Member m4 = new Member("Pawel", "pp@m.pl");
        System.out.println(m3.getId());

        System.out.println(m1.getId());
        System.out.println(m1.getEmail());
        System.out.println(m1.getName());

        System.out.println(m2.getId());
        System.out.println(m2.getEmail());
        System.out.println(m2.getName());

        System.out.println(m3.getId());
        System.out.println(m3.getEmail());
        System.out.println(m3.getName());

        System.out.println(m4.getId());
        System.out.println(m4.getEmail());
        System.out.println(m4.getName());

        Team teamPatryk = new Team("teamPatryk", m1, m2, m3, m4);
        Member[] members2And4 = teamPatryk.getMembers(2,4);
        for(Member member : members2And4){
            System.out.println(member == m4);
            System.out.println(member.getEmail());
        }
    }
}
