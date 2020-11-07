public class WC2018{
    public static void main(String [] args){
        Player p1 = new Player();
        p1.setName("Neymar");
        p1.setNumber(10);
        p1.setTeam("Brazil");
        p1.detail();
        System.out.println("---------------------------");
        Player p2 = new Player("Ronaldo");
        p2.setNumber(7);
        p2.setTeam("Portugal");
        p2.detail();
        System.out.println("---------------------------");
        Player p3 = new Player("Messi", 10);
        p3.setTeam("Argentina");
        p3.detail();
        System.out.println("---------------------------");
        Player p4 = new Player("Neuer", 1, "Germany");
        p4.detail();
    }
}