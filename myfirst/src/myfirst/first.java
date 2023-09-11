
package myfirst;
import java.util.*;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.activeCount());
		System.out.println(thread.currentThread().getName());
		System.out.println(thread.currentThread().getPriority());
		System.out.println(thread.currentThread().isAlive());
	}

}
