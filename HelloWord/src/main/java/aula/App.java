package aula;

/**
 * Hello world!
 *
 */
import javax.swing.JOptionPane;
public class App 
{
	public static int somar(int x,int y) {
		return x+y;
	}
	public static int subtrair(int x,int y) {
		return x-y;
	}
	public static int multiplicar(int x,int y) {
		return x*y;
	}
	public static int dividir(int x,int y) {
		return x/y;
	}
    public static void main( String[] args )
    {
    	System.out.println("passados como parametros 10 e 2");
        System.out.println("soma: "+ somar(10,2) );
        System.out.println("subtrair: "+ subtrair(10,2) );
        System.out.println("multiplicar: "+ multiplicar(10,2) );
        System.out.println("dividir: "+ dividir(10,2) );
      int a=Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
      int b=Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
      JOptionPane.showMessageDialog(null,"passados como parametros "+a+" e "+b+"\nsomar: "+somar(a,b)+"\nsubitrair: "+subtrair(a,b)+"\nmultiplicar: "+multiplicar(a,b)+"\ndividir: "+somar(a,b));
    }
}
