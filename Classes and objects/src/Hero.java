
public class Hero {
    static String copyright;//类属性,静态属性 
    
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
    
    public Hero()
    {
    }
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);       
    } 
    
    public Hero(String name,float hp)
    {
    	
    	this.name = name;
    	this.hp = hp;
    	System.out.println("两个参数的构造方法");
    }
    public Hero(String name,float hp,float armor,int moveSpeed){  
       this(name,hp);
       this.armor = armor;
       this.moveSpeed = moveSpeed;
       System.out.println("四个参数的构造方法");
    }
    public void revive(Hero h){
        h = new Hero("提莫m",383);
        h.showAddressInMemory();
    }
    public static void main(String[] args) {
        Hero garen =  new Hero("盖伦",627.34f,123.6f,50); 
        
        Hero teemo =  new Hero("提莫",383.89f,123.6f,60);
        System.out.println(garen.armor);
        System.out.println(garen.name);
        System.out.println(garen.hp);
        System.out.println(garen.moveSpeed);
        System.out.println("打印对象看到的虚拟地址："+garen);
        garen.showAddressInMemory();
        
        Hero teemom =  new Hero("提莫",383);
        
        //受到400伤害，挂了
        teemom.hp = teemom.hp - 400;
        System.out.println("打印对象看到的虚拟地址1："+teemom); 
        teemom.revive(teemom);
        System.out.println(teemom.hp);
        teemom.showAddressInMemory();
        //复活的提莫指向了新地址，即为一个全新的提莫。
        
        
        Hero.copyright = "版权由公司所有";
        System.out.println(teemom.copyright);
        garen.copyright = "Riot Games";
        System.out.println(garen.copyright);
        System.out.println(teemom.copyright);
        
        //他们共享一个类属性（静态属性）,类属性被修改后所有共享这一属性的变量都会被改变
    }
    
}
