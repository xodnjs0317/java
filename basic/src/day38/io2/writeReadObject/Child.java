package day38.io2.writeReadObject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable{
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		//writeObject()�޼ҵ�� private�� �ٿ���� ����ȭ�� �Ҷ� �ڵ����� ȣ���̵˴ϴ�.
		
		out.writeUTF(field1); //�θ� ���� �ʵ带 ������
		
		out.defaultWriteObject(); // ���ǵ� �ʵ���� ��� ����ȭ�ϴ� �޼ҵ�
		
	}
	
	private void readObject() {
		
	}
}
