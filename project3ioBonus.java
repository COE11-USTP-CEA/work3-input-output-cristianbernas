import java.io.*;

class project3ioBonus{
    public static void main(String []args){
	System.out.println("Hello everyone!");
	InputStreamReader c = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(c);
	System.out.println("Enter the height of triangle:")
	int num = 0;
	try{
	    num = Integer.valueof(b.readline());
	}
	catch(Exception p){
            System.out.println("Invalid Number!")
			
	}
	for(int x=1; x<=num; x++){
	    for(int y=1; y<num -(x-1); y++);{
		System.out.print(" ");
		}
	    for(int z=1; z<=x; z++){
		System.out.print("*");
		for(int c1=1; c1<z; c1+=z;){
		System.out.print("*");
	        }
	    }
	    System.out.println("");
	}
    }
}
