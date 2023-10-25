package string01;

import java.util.Arrays;

public class Ch03_multiArray { // 클래스

	public static void main(String[] args) { //2차원 배열 // 메서드
		int arr[][] = new int[2][3]; //속성
		int[][] score = {{1,5,6},{33,2,7}}; // 2행에 3열
		
		System.out.println(score[1][2]);
		
		System.out.println("score의 행 길기 : " + score.length); //2
		System.out.println("score의 열 길기 : " + score[0].length); //3
		
		for(int i = 0 ; i < score.length;i++) {
			for(int j = 0 ; j < score[i].length;j++) {
				System.out.print(score[i][j] + ",");
			}
			System.out.println();
		}
		
		//score[0][2] = 39;
	
		//int arr1[][] = new int[3][5];
		//int[][] score1 = {{1,5,6,3,7},{33,2,7,88,855},{43,7,5,2,23}}; // 2행에 3열
		
		//System.out.println(score1);
		
		int arr1[][] = new int[3][5];
		int count = 1;
		for(int a = 0;a <arr1.length;a++) {
			for(int b = 0;b <arr1[a].length;b++) {
				arr1[a][b] = count++;
				System.out.print(arr1[a][b] + " ");
			}
			System.out.println();
		}
		//System.out.println(arr1);
		System.out.println(Arrays.deepToString(arr1));
		
		
		/////////////////////////////////////////////////////////문제
		System.out.println("\n===============================================");
		System.out.println("1번.");
		
		int js[][] = {{95,44,100},
					  {95,79,55},
					  {100,73,58},
					  {99,100,98},
					  {12,76,100}};
		
		int sum[] = new int[5] ;
		int avg = 0 ;
		
		System.out.println("번호 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("------------------------------------------");
		for(int c=0;c < js.length;c++) {
			int ksum = 0;
			int esum = 0;
			int msum = 0;
			for(int d=0; d < js[c].length;d++) {
				
				sum[c] += js[c][d];
				avg = sum[c] / js[c].length;
				
				//System.out.print(avg+" ");				
			}
			//System.out.print(sum+" ");
			
			//System.out.print(avg+" ");			
			System.out.println((c+1) +"\t"+ js[c][0] +"\t"+ js[c][1] +"\t"+ js[c][2] +"\t"+ sum[c] +"\t"+ avg);
			
		}
		
		
		System.out.println("------------------------------------------");
		System.out.print("총점,평균\t");
		
		for(int e=0; e < js[0].length ; e++) {
			
			int sum2 = 0 ;
			int avg2 = 0 ;
			
			for(int f=0; f < js.length ; f++) {
				sum2 += js[f][e];
				
			}
			avg2 = sum2 / js.length;
			System.out.print(sum2+","+avg2+"\t");
			//System.out.print(avg2+"\t");
		}
			
		System.out.println("\n\n===============================================");
		System.out.println("2번. 로터리");
		
		int lotto[] = new int[45];
		for(int l = 0; l<lotto.length;l++) {
			lotto[l] = l+1;
		}
		int index = 0;
		for(int l = 0 ; l<6;l++) {
			index = (int)(Math.random()*45+1);
			int tmp = lotto[l];
			lotto[l] = lotto[index];
			lotto[index] = tmp;
			if(tmp != 6) {
				System.out.print(lotto[l]+",");
			}else {
				System.out.print(lotto[l]);
			}
		}
		
	}

}
