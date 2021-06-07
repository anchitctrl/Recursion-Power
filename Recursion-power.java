public class powerofNumber {
	public int power(int base,int power) {
		if(power==0) return 1;
		return base*power(base,power-1);
	}
	public static void main(String[] args) {
		powerofNumber obj=new powerofNumber();
		int res=obj.power(2,3);
		System.out.println(res);
	}
}
