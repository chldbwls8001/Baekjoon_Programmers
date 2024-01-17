import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	for (int i = 0; i < N; i++) { // 별 증가
    		for (int j = 0; j < N - i - 1; j++) {
    			System.out.print(" ");
    		}
    		for (int k = 0; k < 2 * i + 1; k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}

    	for (int i = N - 1; i > 0; i--) { // 별 감소
    		for (int j = 1; j > i - N + 1 ; j--) {
    			System.out.print(" ");
    		}
    		for (int k = 0; k < 2 * i - 1; k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}