package algorithms;

import java.util.LinkedList;

public class graphtotable {
	
	double step = 1.0/1000.0;
	private double[] xtable = new double[(int)(1/step*100)];
	private double[] ytable = new double[(int)(1/step*100)];
	
	
	public graphtotable(Polishorder equation){
		LinkedList<String> line = equation.getList();
		int varamount = equation.getvariabeamount();
		LinkedList<String> temp;
		for(int i = -xtable.length/2; i<xtable.length/2; i++){
			ytable[i+xtable.length/2] = i*step;
			temp = hardclone(line);
			System.out.println(1/step);
			for(int j = 0; j < temp.size(); j++){
				if(temp.get(j).equals("x")){
					
					temp.set(j, Double.toString(i*step));
				}
				if(temp.size() == 1){
					xtable[i+xtable.length/2] = Double.parseDouble(temp.get(0));
					
				}
				if(operatorcheck(line.get(j))){
					
					xtable[i+xtable.length/2] = operate(temp.get(j-1), temp.get(j-2), temp.get(j));
					
					temp.remove(temp.get(j-2));
					temp.remove(temp.get(j-2));
					temp.set(j-2, Integer.toString((int)xtable[i+xtable.length/2]));
					j=j-2;
				}
			}
			
			
		}
		
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
		//case "sqrt":
			//return Math.sqrt()
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
