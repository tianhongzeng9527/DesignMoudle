/**
 * Created by tian on 16-6-6.
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void memthodA(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }
    public void memthodB(){
        subSystemTwo.methodTwo();
    }
    public void memthodC(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.memthodThree();
    }
}
