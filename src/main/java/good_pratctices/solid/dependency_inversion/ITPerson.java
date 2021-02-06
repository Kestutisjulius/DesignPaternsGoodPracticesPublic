package good_pratctices.solid.dependency_inversion;

public abstract class ITPerson {

    public void haveComputer (){
        System.out.println("I have computer");
    }

    abstract void  sayHisOppinion();
}
