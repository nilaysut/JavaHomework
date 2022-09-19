package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		for(int i=1;i<=10;i+=2) { //tek sayıları yazdırmak istersek
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		for(int i=2;i<=10;i+=2) { //çift sayıları yazdırmak istersek
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
		//while
		int i=1;
	    while (i < 10) {
	    	System.out.println(i);
	        i++;
	    }
	    System.out.println("While Döngüsü Bitti");
	    
	    
	    i=1; // Tek sayıları yazdırmak istersek
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");
        
        
        i=2; //Çift sayıları yazdırmak istersek
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");
        
        
        //Do-While
        int j=1; //Şart sağlanmazsa bile do-while bir kere çalışacaktır.(While döngüsünden farkı)
        do {
        	 System.out.println(j);
             j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
        
        int z=18;
        do {
        	System.out.println(z);
        	z+=2;
        }while(z<10);
        System.out.println("Do-While Döngüsü Bitti");
	}

}
