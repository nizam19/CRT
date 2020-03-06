//frequency descending
//value ascending
import java.util.Scanner;
class Sort{
	static int[] freq;
	public static boolean compare(int a,int b){
		if(freq[a]==freq[b])
			return a>b;
		return freq[a]<freq[b];
	}
	public static void sort(int[] a,int n){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(compare(a[i],a[j])){
					int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int n = s.length;
		int[] arr = new int[n];
		freq = new int[100000];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(s[i]);
			freq[arr[i]]++;
		}
		
		sort(arr,n);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}
}