# Abstract-Interface-Part1
Abstract Interface Part1



public abstract class Operator {
	public int cong(int a, int b){
		return a+b;
	}
	public int tru(int a, int b){
		return a-b;
	}
	public int nhan(int a, int b){
		return a*b;
	}
	public int chia(int a, int b){
		return a/b;
	}
}




public class Test extends Operator implements Using{
	@Override
	public int cong(int a, int b) {
		return super.cong(a, b);
	}
	public static void main(String args[]){
		System.out.println("Cong: "+new Test().nhan(4,5));
	}
}





public interface Using {
	public int cong(int a,int b);
	public int tru(int a,int b);
	public int nhan(int a,int b);
	public int chia(int a,int b);
}
