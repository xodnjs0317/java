package day38.io2;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;			//static�� �پ������� ����ȭ���� ����
	transient int field4;		//transient�� �پ��ִ� �ʵ�� ����ȭ�� ���� �ʽ��ϴ�.

}
