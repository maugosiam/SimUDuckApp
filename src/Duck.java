public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBahavior quackBahavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack(){
        quackBahavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
