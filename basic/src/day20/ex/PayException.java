package day20.ex;

// 사용자 정의 Exception
public class PayException extends Exception {
    
    public PayException() {
    }

    public PayException(String message){
        super(message);
    }
}