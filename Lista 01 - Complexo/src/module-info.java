module Complexo {
	
	public class Complex
	{
	  
	  private double realPart;

	 
	  private double imaginaryPart;

	 
	  public Complex()
	  {
	    this(0.0, 0.0);
	  }

	  
	  public Complex(double realPart, double imaginaryPart)
	  {
	    this.realPart = realPart;

	    this.imaginaryPart = imaginaryPart;
	  }

	 
	  public double getRealPart()
	  {
	    return realPart;
	  }

	  
	  public double getImaginaryPart()
	  {
	    return imaginaryPart;
	  }

	  
	  public Complex addition(Complex other)
	  {
	    double real = realPart + other.realPart;

	    double imaginary = imaginaryPart + other.imaginaryPart;

	    return new Complex(real, imaginary);
	  }

	  
	  public Complex subtraction(Complex other)
	  {
	    double real = realPart - other.realPart;

	    double imaginary = imaginaryPart - other.imaginaryPart;

	    return new Complex(real, imaginary);
	  }

	  @Override
	  public String toString()
	  {
	    return "(" + realPart + ", " + imaginaryPart + ")";
	  }
	}
}