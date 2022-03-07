module Triângulo {
	
	[code]package pontogeometrico;

	public class Triangulo {

	private Ponto2D v1;
	private Ponto2D v2;
	private Ponto2D v3;
	private double l1,l2,l3;

	public Triangulo (Ponto2D v1,Ponto2D v2,Ponto2D v3){
	this.v1 = new Ponto2D(v1);
	this.v2 = new Ponto2D(v2);
	this.v3 = new Ponto2D(v3);
	l1=this.v1.DistPontos(this.v2);
	l2=this.v2.DistPontos(this.v3);
	l3=this.v3.DistPontos(this.v1); }

	static boolean formaTriangulo (Ponto2D v1,Ponto2D v2,Ponto2D v3){
	if (v1.DistPontos(v2)+ v1.DistPontos(v3)>v2.DistPontos(v3) && (v1.DistPontos(v2)+ v2.DistPontos(v3)>v3.DistPontos(v1)) && (v2.DistPontos(v3)+ v1.DistPontos(v3)>v1.DistPontos(v2))){
	return true;}
	return false; }

	boolean equilatero (Triangulo t1){
	if ((t1.l1==l2) && (t1.l2==l3))
	return true;
	return false;}

	boolean isosceles(){
	if ((l1==l2) || (l2==l3))
	return true;
	return false;}

	boolean escaleno(){
	if (((l1!=l2) && (l2!=l3)) && (l1!=l3))
	return true;
	return false;}

	double areaT(){
	double sp = ((l1+l2+l3)/2);
	return (Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3))); }
	public static void main(String[] args) {
	Ponto2D v1 = new Ponto2D(2,1);
	Ponto2D v2 = new Ponto2D(1,3);
	Ponto2D v3 = new Ponto2D(5,4);
	Triangulo t1 = new Triangulo(v1,v2,v3);

	System.out.println("É um triângulo? " + formaTriangulo(v1,v2,v3));
	System.out.println("É um Equilátero? " + t1.equilatero(t1));
	System.out.println("É um Isósceles? " + t1.isosceles());
	System.out.println("É um Escaleno? " + t1.escaleno());
	System.out.println("A área do Triângulo t1 é: " + t1.areaT());
	v1.setX(1);v1.setY(0);
	v2.setX(3);v2.setY(2);
	v3.setX(5);v3.setY(4);
	System.out.println("É um triângulo? " + formaTriangulo(v1,v2,v3));

	}
}