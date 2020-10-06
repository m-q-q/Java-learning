public class Hp extends Hero{
    public class Hero{
    	String name;
    }
    public void heal() {
        System.out.println(name + " 进行了加血，但是不确定给谁加了");
    }
  
    public void heal(Hero h) {
        System.out.println(name + "对" + h.name + "英雄加血 ");
    }
  
    public void heal(Hero h, int hp) {
        System.out.println(name + "同时对" + h.name +  "进行了"+hp+"的加血 ");
    }
     
    public static void main(String[] args) {
        Hp bh = new Hp();
         bh.name = "赏金猎人";
   
         Hero h1 = new Hero();
         h1.name = "盖伦";
         Hero h2 = new Hero();
         h2.name = "提莫";
          
         bh.heal();
         bh.heal(h1);
         bh.heal(h1,500);
    }
}