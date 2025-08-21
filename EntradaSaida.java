import javax.swing.JOptionPane;
public class EntradaSaida{
    public static void main(String args[]){
        double Numero1,Numero2;
        Numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        Numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        double Soma = Numero1 + Numero2;
        JOptionPane.showMessageDialog(null, Soma);
    }
}