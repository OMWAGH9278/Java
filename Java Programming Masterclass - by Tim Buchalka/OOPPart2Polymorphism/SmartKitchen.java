public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        this.brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        this.iceBox.setHasWorkToDo(true);
    }
    public void loadDishWasher(){
        this.dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean coffeeFlag,
                                boolean dishWasherFlag,
                                boolean refrigeratorFlag){
        this.brewMaster.setHasWorkToDo(coffeeFlag);
        this.dishWasher.setHasWorkToDo(dishWasherFlag);
        this.iceBox.setHasWorkToDo(refrigeratorFlag);
    }
    public void doKitchenWork(){
        this.brewMaster.brewCoffee();
        this.dishWasher.doDishes();
        this.iceBox.orderFood();
    }
}
