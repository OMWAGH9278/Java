
// 1. @Override : This annotation forces method to compulsory 
//                override parent method 

class Book {
    public void data() {
    }
}

class TextBook extends Book {
    @Override
    public void data() {
    }
}

// 2. Deprecated : It is used on methods of class not to be used.

class Animals {
    public void species() {
    };

    @Deprecated
    public void name() {
    };
}

// 3. FunctionalInterface : forces a interface to be a functional interface
// (interface with one function)

@FunctionalInterface
interface Desk {
    public void cover();
    // public void head();
}

// 4. SafeVarArgs : For generic method it makes arguments safe

class Birds<T> {
    @SafeVarargs
    private void birdName(T... str) {
        for (T x : str) {
            System.out.println(x);
        }
    }
}

// 5. SuppressWarnings : It forcefully suppress warnings

class InBuiltAnnotation {
    @SuppressWarnings("deprecation")
    public static void main(String arg[]) {
        Animals a = new Animals();
        a.species();
        a.name();
    }
}