package br.com.aula9.imp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Dig VL1: ");
			int vl1 = s.nextInt();
			System.out.println("Dig VL2: ");
			int vl2 = s.nextInt();
			int result= 0;
			if(vl1>vl2) {
				result = vl1/vl2;
				System.out.println("Divisão: "+result);
			}else {
				result = vl2/vl1;
				System.out.println("Divisão: "+result);
			}
			
		} catch(InputMismatchException e){
			System.out.println("Valor deve ser NUMERICO");
			
		} catch(ArithmeticException e){
			
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Ocorreu erro....");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
	}

}
