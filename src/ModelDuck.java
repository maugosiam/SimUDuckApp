public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBahavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck!");
    }
}
