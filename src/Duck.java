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

    //setters methods to FlyBehavior and QuackBehavior (to change duck's behavior at runtime

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBahavior(QuackBahavior qb){
        quackBahavior = qb;
    }
}
