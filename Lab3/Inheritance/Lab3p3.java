class Lab3p1{
	static int view;
	
	public static void display()
	{ System.out.println(view);
	}
	public int show(){
	return view;
	}
}

class Lab3p2 extends Lab3p1{
	static int neu=5;
		public static void display(){
    System.out.println(view+neu);
	}
	@Override
	public int show(){
	super.show();
	return (view+neu);
	}
	public void pearl(){
 	super.display();
	System.out.println("Iam B child of A");
	}
}

class Lab3p3{
	public static void main(String[] args){
	Lab3p2 p = new Lab3p2();
	
	p.display();
	p.show();
	p.pearl();
	
	}
}
