
@interface MyAnnotation {
    String firstName();

    String middleName();

    String lastName();
}

@MyAnnotation(firstName = "Om", middleName = "Mangesh", lastName = "Wagh")
class UserDefinedAnnotation {
    public static void main(String arg[]) {
        System.out.println();
    }
}