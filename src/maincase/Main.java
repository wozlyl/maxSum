package maincase;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("输入数组长度：");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("输入数组内容：");
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("最大连续子数组和为："+maxsum(n,number));
    }
	public static int maxsum(int n,int[] number){
        int sum=0,max=0,sum1=0;
        for(int i=0;i<n;i++) {
        	if(number[i]<0) {
        		sum1++;
        	}
        }
        if(sum1==n) {
        	max=0;
        }
        else {
        	for(int i=0;i<n;i++){
        		for(int j=i;j<n;j++){
        			sum=0;
        			for(int l=i;l<=j;l++) {
        				sum += number[j];
        				if(max < sum){
        					max = sum;
        				}
        			}
        		}
        	}
        }
        return max;
    }
}