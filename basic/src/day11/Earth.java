package day11;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	
	//static final은 선언시 값을 입력하거나 정적 초기화 블록으로 값을 입력할 수 있습니다.
	static {
		EARTH_SURFACE_AREA = 4 *Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
