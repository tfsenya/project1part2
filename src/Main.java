public class Main {
    public static void main(String[] args) {
        // integer
        Integer integer = Integer.valueOf(10);
        int intValue = integer.intValue();
        String integerToString = integer.toString();
        int parsedInt = Integer.parseInt("20");
        int compareToResult = integer.compareTo(15);

        System.out.println("Integer: " + integer);
        System.out.println("intValue: " + intValue);
        System.out.println("integerToString: " + integerToString);
        System.out.println("parsedInt: " + parsedInt);
        System.out.println("compareToResult: " + compareToResult);

        // double
        Double doubleValue = Double.valueOf(3.14);
        double doublePrimitive = doubleValue.doubleValue();
        String doubleToString = doubleValue.toString();
        int doubleHashCode = doubleValue.hashCode();
        int doubleCompareToResult = doubleValue.compareTo(2.0);

        System.out.println("Double: " + doubleValue);
        System.out.println("doublePrimitive: " + doublePrimitive);
        System.out.println("doubleToString: " + doubleToString);
        System.out.println("doubleHashCode: " + doubleHashCode);
        System.out.println("doubleCompareToResult: " + doubleCompareToResult);

        // boolean
        Boolean booleanValue = Boolean.valueOf(true);
        boolean booleanPrimitive = booleanValue.booleanValue();
        String booleanToString = booleanValue.toString();
        int booleanHashCode = booleanValue.hashCode();
        int booleanCompareToResult = booleanValue.compareTo(false);

        System.out.println("Boolean: " + booleanValue);
        System.out.println("booleanPrimitive: " + booleanPrimitive);
        System.out.println("booleanToString: " + booleanToString);
        System.out.println("booleanHashCode: " + booleanHashCode);
        System.out.println("booleanCompareToResult: " + booleanCompareToResult);

        // characters
        Character character = Character.valueOf('A');
        char charPrimitive = character.charValue();
        String charToString = character.toString();
        int charHashCode = character.hashCode();
        int charCompareToResult = character.compareTo('B');

        System.out.println("Character: " + character);
        System.out.println("charPrimitive: " + charPrimitive);
        System.out.println("charToString: " + charToString);
        System.out.println("charHashCode: " + charHashCode);
        System.out.println("charCompareToResult: " + charCompareToResult);

        // compare string
        String str1 = "Hello";
        String str2 = "World";
        int stringCompareToResult = str1.compareTo(str2);

        System.out.println("stringCompareToResult: " + stringCompareToResult);

        // compare numbers
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(20);
        String concat1 = String.valueOf(a + b);
        String concat2 = a.toString() + b.toString();

        System.out.println("concat1: " + concat1);
        System.out.println("concat2: " + concat2);
    }
}
