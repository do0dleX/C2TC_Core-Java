
public class Armstrong {
	static boolean armstrong(int a) {
		int temp=0, count=0, last=0;
		double sum=0;
		temp=a;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=a;
		while(temp>0) {
			last=temp%10;
			sum=sum+Math.pow(last, count);
			temp=temp/10;
		}
		if(sum==a) {
			return true;
		}
		else
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1533;
		System.out.println("The number is: "+a);
		if(armstrong(a)) {
			System.out.println(a+" is Armstrong Number");
		}
		else {
			System.out.println(a+" is not Armstrong Number");
		}
	}

}
