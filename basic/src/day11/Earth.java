package day11;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	
	//static final�� ����� ���� �Է��ϰų� ���� �ʱ�ȭ ������� ���� �Է��� �� �ֽ��ϴ�.
	static {
		EARTH_SURFACE_AREA = 4 *Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
