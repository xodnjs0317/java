package day29.Thread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {	//���� �޸𸮿� ���� �����ϴ� �żҵ�
		this.memory = memory;	//�Ű����� memory�ʵ忡 ����
		try {
			Thread.sleep(2000);	//�����带 2�ʰ� �Ͻ�������Ŵ
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
}