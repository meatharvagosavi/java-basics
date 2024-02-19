import javax.swing.JOptionPane; //swing GUI utility
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name); //syntax for dialogue box

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //converting into integer value
        JOptionPane.showMessageDialog(null,"Your are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"Your height is "+height+" cm");
    }
}
