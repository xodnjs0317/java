package day20.ex;

// ����� ���� Exception
public class PayException extends Exception {
    
    public PayException() {
    }

    public PayException(String message){
        super(message);
    }
}