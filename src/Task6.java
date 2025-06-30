//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task6 {
    public static void main(String[] args) {
        //A nested loop that creates this figure (there are no blank lines)
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for (int row = 5; row >=1; row--) {
            for (int col = 1; col <= row; col ++) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }
    }
}