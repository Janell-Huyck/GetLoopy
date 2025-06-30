//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task7 {
    public static void main(String[] args) {
        //A nested loop that creates this square figure (there are no blank lines)
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *

        for (int row = 1; row <=5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }
    }
}