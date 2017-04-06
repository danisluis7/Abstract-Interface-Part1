
public class Test extends Operator implements Using{
	@Override
	public int cong(int a, int b) {
		return super.cong(a, b);
	}
	public static void main(String args[]){
		System.out.println("Cong: "+new Test().nhan(4,5));
	}
}
