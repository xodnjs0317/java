
public class GradeEvaluator {
	public static void main(String[] args){
		GradeEvaluator evaluator = new GradeEvaluator();
        
        String gradeA = "";
        int[] workPointsA = {60, 70, 85, 74};
        int engPointA = 640;
        
        String gradeB = "";
        int[] workPointsB = {90, 85, 78, 86};
        int engPointB = 980;
        
        gradeA = evaluator.evaluateGrade(workPointsA, engPointA);
        System.out.println("=> ����A ��� ���: "+gradeA);
        System.out.println("-----------------------");
        gradeB = evaluator.evaluateGrade(workPointsB, engPointB);
        System.out.println("=> ����B ��� ���: "+gradeB); 
    }
    
    public String evaluateGrade(int[] workPoints, int engPoint){

    }
}
