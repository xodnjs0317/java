package day20.ex;

public class PayMentTest {

    // main() : �������� ������.
    public static void main(String[] args) throws PayException {
        
        CardPayment card1 = new CardPayment("11����","Javaå",17000,"123-432-111","0070",0);
        payProcess( card1 );        
        System.out.println("-------------------------------------");        
        CashPayment cash1 = new CashPayment("������ũ","������",2400000,"198-32");
        payProcess( cash1 );
        System.out.println("-------------------------------------");    
        
        // �Ʒ��� Exception �߻�  �׽�Ʈ �ڵ���. �ּ��� Ǯ��~ Exception ó���Ǵ��� Ȯ�� �� ������. 
        
        // Exception ���� 1. ���������� ��� �׸� �����ϼ���.
       CardPayment card2 = new CardPayment("����24","�Ҽ�å",2000,"843-12-434","1234",-2);
        payProcess( card2 );    
        
        // Exception ���� 2. ���������� ��� �׸� �����ϼ���.
        //CashPayment cash2 = new CashPayment("G����","�ڵ���",0,"999-56");
        // payProcess( cash2 );        

    }
    
    // payProcess() : �������� ������.
    public static void payProcess(Payment p) throws PayException {
        p.pay();
        System.out.println(p);      
    }

}
