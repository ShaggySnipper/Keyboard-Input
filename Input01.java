import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.

        //JOptionPane.showInputDialog("Type something:");

        //Parse the input as an int.
        //Print its value +1

        //String input = JOptionPane.showInputDialog("Type Something:");
        //int parsedValue = Integer.parseInt(input);
        //System.out.println(parsedValue + 1);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        int input = Integer.parseInt(JOptionPane.showInputDialog("Type something:")) + 1;
        System.out.println(input);
    }
}
