public class CheckingNonNegativity {
    public static double check(double side){
        if (side < 0){
            throw new IllegalArgumentException("Side can't be negative");
        } else {
            return side;
        }
    }

}

