
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value = { ElementType.LOCAL_VARIABLE, ElementType.METHOD })
@Inherited
// @Repeatable(MyAnnotation.class)
@interface MyAnnotation {
    String firstName();

    String middleName();

    String lastName();
}

class InBuiltAnnotation2 {
    @MyAnnotation(firstName = "Om", middleName = "Mangesh", lastName = "Wagh")
    public int value() {
        return 1;
    }

    public static void main(String arg[]) {
        @MyAnnotation(firstName = "Om", middleName = "Mangesh", lastName = "Wagh")
        int numFirst;

    }
}