public class Player{
    private String name="Default";
    private int number=0;
    private String team="default";
    
    public Player(){}
    public Player(String n){
        name=n;
    }
    public Player(String n,int o){
        name=n;
        number=o;
    }
    public Player(String n,int o,String t){
        name=n;
        number=o;
        team=t;
    }
    public void setName(String n){
        name=n;
    }
    public void setNumber(int o){
        number=o;
    }
    public void setTeam(String t){
        team=t;
    }
    public void detail(){
        System.out.println(name+"*is*no."+number+"*for*"+team);
    }
}