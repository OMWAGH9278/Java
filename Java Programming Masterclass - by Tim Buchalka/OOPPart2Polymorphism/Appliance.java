public class Appliance {

    private boolean hasWorkToDo = false;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isWorkToBeDone() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance {

    public void orderFood(){
        if(isWorkToBeDone()){
            System.out.println("Food is being ordered.");
            setHasWorkToDo(false);
        }
    }

    public Refrigerator(){
        this(false);
    }
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
}
class DishWasher extends Appliance {

    public void doDishes(){
        if(isWorkToBeDone()){
            System.out.println("Dishes are being washed.");
            setHasWorkToDo(false);
        }
    }
    public DishWasher(){
        this(false);
    }
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
}
class CoffeeMaker extends Appliance {

    public void brewCoffee(){
        if(isWorkToBeDone()){
            System.out.println("Coffee is being brewed.");
            setHasWorkToDo(false);
        }
    }
    public CoffeeMaker(){
        this(false);
    }
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
}