module Eq2Grau {
	
	class Bhaskara {
	    public double a, b, c;
	    public Bhaskara() {
	        Scanner le = new Scanner(System.in);
	        System.out.print("Informe o valor de a: ");
	        a = le.nextDouble();
	        System.out.print("Informe o valor de b: ");
	        b = le.nextDouble();
	        System.out.print("Informe o valor de c: ");
	        c = le.nextDouble();
	    }
	    public double delta() {
	        return (b*b)-(4*a*c);
	    }
	    public void raizes(double valordelta) {
	        double x1=(-b+Math.sqrt(valordelta))/(2*a);
	        double x2=(-b-Math.sqrt(valordelta))/(2*a);
	        System.out.println("Valores raizes = " + x1 + ", " + x2);
	    }
	    
	}
	public class EqSegGrauClasse { 
	    public static void main(String[] args) {
	        Bhaskara objeto = new Bhaskara();
	        double valordelta = objeto.delta();
	        System.out.println("Delta = " + valordelta);
	        if (valordelta<0) System.out.print("Delta menor que zero");
	        else objeto.raizes(valordelta);
	        System.out.println();  
	    }
	}    
}