public class GradeExam {
	public static void main(String args[]) {
		int noOfStudents = 8;
		int noOfQuestions = 10;
		
		char[][] answers = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};

		char keys[] = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for(int i=0; i < noOfStudents; i ++){
			int correctAnswers = 0;
			
			for(int j=0 ; j < noOfQuestions; j++ ){
				if(answers[i][j] == keys[j]){
					correctAnswers ++;
				}
			}
			System.out.println("Corrent answers for student with roll no. "+ (i+1) +" is" + correctAnswers);
		}
	}
}