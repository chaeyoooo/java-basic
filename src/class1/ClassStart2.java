package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsNames = {"학생1", "학생2"}; // 변경 3개 해야함! 인덱스 순서 정확하게 맞춰야함!
        int[] studentsAges = {15 ,16};
        int[] studentsGrade = {90, 80};

        for(int i = 0; i < studentsNames.length; i++){
            System.out.println("이름" + studentsNames[i] + "나이" + studentsAges[i] + "점수" + studentsGrade[i]);
        }
    }
}
