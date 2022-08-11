package Test;

import com.cjzlxg.Timer.FirstTimer;
import com.cjzlxg.Timer.Timer;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Timer time = new FirstTimer();
		time.begin();
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println(time.quit());
	}
}
