package day16.interface01;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		//�͸� ���� ��ü
		//���� ���� ��ü�� ������ �ʰ� �ٷ� ����� �� �ֵ��� �߻�޼ҵ带 ��ü������ �����Ͽ�
		//�̸� ���� ��ü�� ����� ����ϴ� ���
		
		
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
	}
}
