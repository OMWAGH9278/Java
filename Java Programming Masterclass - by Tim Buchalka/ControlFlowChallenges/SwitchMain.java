public class SwitchMain {
    public static void main(String[] args) {

        int switchValue = 21;
        switch(switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3, 4 or 5");
                System.out.println("Actually it was "+switchValue);
                break;
            default:
                System.out.println("Value is not 1, 2, 3, 4 or 5");
                break;
        }
    }
}
