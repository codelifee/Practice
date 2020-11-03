class Six13 {
	public static void main(String[] args){
		if(args.length != 3) {
			System.out.println("java Six13 num01 op num02");
			System.exit(0);
		}
		int num01=Integer.parseInt(args[0]);
		char op=args[1].charAt(0);
		int num02=Integer.parseInt(args[2]);
		int result=0;

		switch(op) {
			case '+': result=num01+num02; break;
			case '-': result=num01-num02; break;
			case 'x': result=num01*num02; break;
			case '/': result=num01/num02; break;
			default: System.out.println("it is not a assisted function"); 
		}	
			System.out.println("the result : " + result);
	}
}
