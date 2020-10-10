package charactor;
import charactor.Hreo;
public interface Healer {
    
    public void  heal();
}

class Support extends Hreo implements Healer{

    public void heal() {
        System.out.println("治疗");
    }
 
}