package day38.io2;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;			//static이 붙어있으면 직렬화에서 제외
	transient int field4;		//transient가 붙어있는 필드는 직렬화를 하지 않습니다.

}
