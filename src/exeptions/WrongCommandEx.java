package exeptions;

public class WrongCommandEx extends  RuntimeException{
    public WrongCommandEx(String message) {
        super(message);
    }
}
