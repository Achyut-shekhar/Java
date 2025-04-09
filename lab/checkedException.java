import java.util.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomExceptionA extends Exception {
    public CustomExceptionA(String message) {
        super(message);
    }
}

class CustomExceptionB extends Exception {
    public CustomExceptionB(String message) {
        super(message);
    }
}

class ExceptionThrower {
    public void throwException() throws CustomException, CustomExceptionA, CustomExceptionB {
        throw new CustomException("first exception");
    }
}

public class checkedException {
    public static void main(String args[]) {
        ExceptionThrower except = new ExceptionThrower();
        try {
            except.throwException();
        } catch (CustomException | CustomExceptionA | CustomExceptionB e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
