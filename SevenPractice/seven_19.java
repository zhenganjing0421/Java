package sevenPractice;

import java.util.Scanner;
import java.util.Stack;
  
public class seven_19 {
  
    private static Stack<Integer> getElements(int val) {
        Stack<Integer> result = new Stack<Integer>();
        int prime = 2;
        while (val > 1) {
            while (!isPrime(prime)) {
                prime++;
            }
            while (val % prime == 0) {
                result.push(prime);
                val = val / prime;
            }
            prime++;
        }
        return result;
    }
  
    private static boolean isPrime(int num) {
        boolean flag = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
  
    public static void main(String[] args) {
        System.out.println("请输入要计算的整数: ");
        Scanner scanner = new Scanner(System.in);
        int toComputed = scanner.nextInt();
        Stack<Integer> elements = getElements(toComputed);
        while (!elements.isEmpty()) {
            System.out.println(elements.pop());
        }
    }
}