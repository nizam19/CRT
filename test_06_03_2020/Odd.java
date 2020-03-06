import java.util.Scanner;
class Odd{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		String[] arr = sc.nextLine().split(" ");
		for(int i=0;i<n;i++){
			if(Integer.parseInt(arr[i])%2!=0){
				int m=arr[i].length(),prod=1;
				System.out.print(arr[i]+" ");
				for(int j=0;j<m;j++){
					System.out.print(arr[i].charAt(j));
					prod*=(int)arr[i].charAt(j)-48;
					if(j!=m-1)
						System.out.print("*");
				}
				if(m==1)
					System.out.print("*1");
				System.out.print("="+prod+" ");
			}
		}
		sc.close();
	}
}