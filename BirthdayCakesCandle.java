package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakesCandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no_of_candles=sc.nextInt();
		int candles_height[]=new int[no_of_candles];
		for(int i=0;i<candles_height.length;i++){
			candles_height[i]=sc.nextInt();
			
		}
		
		
		Arrays.sort(candles_height);
		int blow=candles_height[candles_height.length-1];
		int count=1;
		for(int i=candles_height.length-2;i>=0;i--){
			if(candles_height[i]==blow){
				count++;
			}
			
		}
		System.out.println(count);
		// I am removing previous change
		//add

	}

}
