package Day08_IfStatement;

public class MultibranchIf_Paractice {
    public static void main(String[] args) {
        double score = 66;
        boolean AGrade = score >= 90 && score <= 100;
        boolean BGrade = score < 90 && score >= 80;
        boolean CGrade = score < 80 && score >= 70;
        boolean DGrade = score < 70 && score >= 60;

        char grade = ' ';
        if (AGrade) {
            grade = 'A';
        } else if (BGrade) {
            grade = 'B';
        } else if (CGrade) {
            grade = 'C';
        } else if (DGrade) {
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println(grade);
    }


}
