package test;

import java.util.Scanner;

public class chislo {
	public static void main(String[] args) {
		int stat=1;
		while(stat==1) {
			stat=start();
		}
		 System.out.println("до свидания");
	}
	
	public static int start() {
		Scanner in = new Scanner(System.in);
        System.out.println("введите первое число интервала ");
        int min = in.nextInt();
      
        
        Scanner in2 = new Scanner(System.in);
        System.out.println("введите последнее число интервала ");
        int max = in2.nextInt();
        
        
        char otv=' ';
        int id=0;
        int cl;
        
        while (otv!='y'){
        	cl=game(min,max);
        	Scanner l = new Scanner(System.in);
            System.out.println("Вы загадали число "+cl+" ? В случае правильного ответа введите 'y', иначе введите '>' или '<'");
            otv = l.next().charAt(0);
            if (otv=='>') {
            	min=cl;
            	id++;
            }
            if (otv=='<') {
            	max=cl;
            	id++;
            }
        }
        System.out.println("я угадал число за "+id+" попыток\n");
        Scanner l2 = new Scanner(System.in);
        System.out.println("Сыграем еще раз? Введите 'y' или 'n'");
        char res = l2.next().charAt(0);
        int a=0;
        if (res=='y') {
        	a=1;
        }
        if (res=='n') {
        	a=0;
        }
		return a;
	}
	public static  int game(int a,int b) {
		int i=a+(b-a)/2;
		return i;
	}
}
