import java.util.Scanner;
class Count{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		int n = arr.length;
		
		int[] size = new int[100];
		int maxx = 0;
		
		for(int i=0;i<n;i++){
			size[arr[i].length()-1]++;
			maxx = (arr[i].length()>maxx?arr[i].length():maxx);
		}
		for(int i=0;i<maxx;i++){
			System.out.println("size["+(i+1)+"]:"+size[i]);
		}
		
		sc.close();
	}
}