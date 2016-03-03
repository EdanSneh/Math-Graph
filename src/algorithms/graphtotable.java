package algorithms;

import java.util.LinkedList;

public class graphtotable {
	private double[] xtable = new double[100];
	private double[] ytable = new double[100];
	
	public graphtotable(Polishorder equation){
		LinkedList<String> line = equation.getList();
		int varamount = equation.getvariabeamount();
		LinkedList<String> temp;
		for(int i = -xtable.length/2; i<xtable.length/2; i++){
			temp = hardclone(line);
			for(int j = 0; j < temp.size(); j++){
				if(temp.get(j).equals("x")){
					temp.add(i, Integer.toString(j));
				}
				if(operatorcheck(line.get(j))){
					xtable[i+xtable.length/2] = operate(line.get(j-1), line.get(j-2), line.get(j));
					temp.remove(temp.get(j-2));
					temp.remove(temp.get(j-2));
					temp.remove(temp.get(j-2));
					temp.add(j-2, Integer.toString((int)xtable[i+xtable.length/2]));
					System.out.println(temp);
				}
			}
			
			
		}
		
		System.out.println(line);
	}
	
	private double operate(String var2, String var1, String operator) {
		double num1 = Double.parseDouble(var1);
		double num2 = Double.parseDouble(var2);
		switch(operator){
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1*num2;
		case "/":
			return num1/num2;
		case "^":
			return Math.pow(num1, num2);
		default:
			System.err.println("Error the operator is not an operator");
			System.exit(1);
			
		}
		return 99999;
		
	}

	public static boolean operatorcheck(String operator){
		if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*") || operator.equals("^")){

			return true;
		}
		return false;
	}
	
	private LinkedList<String> hardclone(LinkedList<String> list){
		LinkedList<String> temp = new LinkedList<String>();
		for (int i = 0; i < list.size(); i++) {
			temp.add(list.get(i));
		}
		return temp;
		
	}
	
	public double[] getxtable(){
		return xtable;
	}
	public double[] getytable(){
		return ytable;
	}
}
