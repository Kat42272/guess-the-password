import javax.swing.*;

public class guessThePassword {
  public static void main(String[] args) {
    String input;
    input = JOptionPane.showInputDialog("Enter the secret message.");
    if(input.equals("Evil Genius")) {
      System.out.println("YOU GOT THE SECRET MESSAGE!!!");
    }
    else {
      System.out.println("WRONG!! Hahaha!");
    }
  }
}