package day15;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCELLphone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("�� :" + dmbCellPhone.model);
		System.out.println("���� :" + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� :" + dmbCellPhone.channel);
		
		//CellPhone���κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("�� ~ ��");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
}
