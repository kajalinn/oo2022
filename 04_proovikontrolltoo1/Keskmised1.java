public class Keskmised1{
	public static double keskmine(double a, double b, double c){
		return (a+b+c)/3.0;
	}
	public static double[] libisev(double[] arvud){
		double[] v=new double[arvud.length-2];
		for(int i=0; i<v.length; i++){
			v[i]=keskmine(arvud[i], arvud[i+1], arvud[i+2]);
		}
		return v;
	} 
	public static void main(String[] arg){
		System.out.println(keskmine(2, 5, 5));
		double[] sisend={3, 7, 6, 5};
		double[] vastus=libisev(sisend);
		for(int i=0; i<vastus.length; i++){
			System.out.println(vastus[i]);
		}
	}
}

/*
4.0
5.333333333333333
6.0

*/