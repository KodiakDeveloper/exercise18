package selectionStructures;

import javax.swing.JOptionPane;

public class Ex18 {

	public static void main(String[] args) {

		float firstTest, secondTest, thirdTest;

		float arithmeticMean;

		float finalExam_1, finalExam_2;

		firstTest = Float.parseFloat(JOptionPane.showInputDialog(null, "Input first test: "));

		secondTest = Float.parseFloat(JOptionPane.showInputDialog(null, "Input second test: "));

		thirdTest = Float.parseFloat(JOptionPane.showInputDialog(null, "Input third test: "));

		if (firstTest == 0 && secondTest == 0 && thirdTest == 0) {

			JOptionPane.showMessageDialog(null, "You did not pass");
		}

		else {

			arithmeticMean = (firstTest + secondTest + thirdTest) / 3;

			JOptionPane.showMessageDialog(null, "Arithmetic Mean: " + arithmeticMean);

			if (arithmeticMean >= 7) {

				JOptionPane.showMessageDialog(null, "You have passed");
			}

			else if (arithmeticMean < 7) {

				finalExam_1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Input your final Exam"));

				finalExam_2 = (arithmeticMean / finalExam_1) / 2;

				if (finalExam_2 >= 5) {

					JOptionPane.showMessageDialog(null, "You have passed on final exam");
				}

				else {

					JOptionPane.showMessageDialog(null, "You did not pass on final exam");
				}

			}

		}

	}

}
