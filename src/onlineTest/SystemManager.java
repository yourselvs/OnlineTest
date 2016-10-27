package onlineTest;

public class SystemManager implements Manager {

	@Override
	public boolean addExam(int examId, String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addTrueFalseQuestion(int examId, int questionNumber, String text, double points, boolean answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMultipleChoiceQuestion(int examId, int questionNumber, String text, double points, String[] answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFillInTheBlanksQuestion(int examId, int questionNumber, String text, double points,
			String[] answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getKey(int examId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStudent(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void answerTrueFalseQuestion(String studentName, int examId, int questionNumber, boolean answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void answerMultipleChoiceQuestion(String studentName, int examId, int questionNumber, String[] answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void answerFillInTheBlanksQuestion(String studentName, int examId, int questionNumber, String[] answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getExamScore(String studentName, int examId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getGradingReport(String studentName, int examId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLetterGradesCutoffs(String[] letterGrades, double[] cutoffs) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getCourseNumericGrade(String studentName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCourseLetterGrade(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCourseGrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getMaxScore(int examId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMinScore(int examId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAverageScore(int examId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saveManager(Manager manager, String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public Manager restoreManager(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
