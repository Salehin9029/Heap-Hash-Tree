import javax.annotation.Generated;

import hashTable.CuckooHashTable;
import hashTable.StringHashFamily;
import hashTable.QuadraticProbingHashTable;
import hashTable.SeparateChainingHashTable;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 final int NUMS = 2000000;
		 int limit = 10;
	       
	     
	     CuckooHashTable<String> H = new CuckooHashTable<>( new StringHashFamily( 3 ), 2000);
	     QuadraticProbingHashTable<String> I = new QuadraticProbingHashTable<>();
	     SeparateChainingHashTable<String> J = new SeparateChainingHashTable<>( );
	     GenerateStrings generateStrings = new GenerateStrings();
	     task1(NUMS, H, generateStrings, limit);
	     task2(NUMS, H, limit);
	     task3(H, generateStrings);
	     task11(NUMS, I, generateStrings, limit);
	     task22(NUMS, I, limit);
	     task33(I, generateStrings);
	     task111(NUMS, J, generateStrings, limit);
	     task222(NUMS, J, limit);
	     task333(J, generateStrings);
	}
	    private static void task333(SeparateChainingHashTable<String> j, GenerateStrings generateStrings) {
	        System.out.println("Separate Chaining Started...");
	        for (int n = 1; n < 21; n++) {
	            int power = (int) Math.pow(2, n);
	   		 
	            int limit = 10;
	            
	            task111(power, j, generateStrings, limit);
	   	     	task222(power, j, limit);}
	
	}
		private static void task222(int nUMS, SeparateChainingHashTable<String> j, int limit) {
		// TODO Auto-generated method stub
			System.out.println("Separate Chaining Started...");
		    double search_start = 0, search_end = 0;

		    System.out.println("Separata Chaining Started...");
		    search_start = System.nanoTime();
		  	
		    for (int z = 0; z < nUMS; z++) {
		    	String checker= GenerateStrings.getAlphaNumericString(limit);
//		    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
		        if (j.contains(checker)) {
		            j.remove(checker);
//		            System.out.println("String Removed");
		        }
		    }
		    search_end = System.nanoTime();
		    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");


			
		
	}
		private static void task111(int nUMS, SeparateChainingHashTable<String> j, GenerateStrings generateStrings,
			int limit) {
		// TODO Auto-generated method stub
			long start = System.nanoTime();
		    System.out.println( "Fill in the table... Seperate Chaining" );

			for( int i = 0; i < nUMS; i++)
			{
				 
		         
				j.insert(GenerateStrings.getAlphaNumericString(limit));

			}
//			System.out.println("Total Size " + j.size());
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/2000000);

	}
		private static void task33(QuadraticProbingHashTable<String> i, GenerateStrings generateStrings) {
		// TODO Auto-generated method stub
	        System.out.println("QUADRATIC Started...");
	        for (int n = 1; n < 21; n++) {
	            int power = (int) Math.pow(2, n);
	   		 
			 int limit = 10;

	            task11(power, i, generateStrings, limit);
	   	     task22(power, i, limit);}
		
	}
		private static void task22(int nUMS, QuadraticProbingHashTable<String> i, int limit) {
		// TODO Auto-generated method stub
			System.out.println("QUADRATIC Started...");
		    double search_start = 0, search_end = 0;

		    System.out.println("Searching Started...");
		    search_start = System.nanoTime();
		  	
		    for (int z = 0; z < nUMS; z++) {
		    	String checker= GenerateStrings.getAlphaNumericString(limit);
//		    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
		        if (i.contains(checker)) {
		            i.remove(checker);
//		            System.out.println("String Removed");
		        }
		    }
		    search_end = System.nanoTime();
		    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");


	}
		private static void task11(int nUMS, QuadraticProbingHashTable<String> i, GenerateStrings generateStrings,
			int limit) {
		// TODO Auto-generated method stub
			System.out.println("QUADRATIC Started...");
		    long start = System.nanoTime();
		    System.out.println( "Fill in the table..." );

			for( int z = 0; z < nUMS; z++)
			{
				 
		         
				i.insert(GenerateStrings.getAlphaNumericString(limit));

			}
			System.out.println("Total Size " + i.size());
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/2000000);
		     
	}
		private static void task3(CuckooHashTable<String> h, GenerateStrings generateStrings) {
	        System.out.println("\nTASK 3 Started...");
	        for (int n = 1; n < 21; n++) {
	            int power = (int) Math.pow(2, n);
	   		 
	            int limit = 10;

	            task1(power, h, generateStrings, limit);
	   	     	task2(power, h, limit);}
		
	}
		public static void task1(int NUMS, CuckooHashTable<String> h, GenerateStrings generateStrings, int limit) { 
	    long start = System.nanoTime();
	    System.out.println( "Fill in the table..." );

		for( int i = 0; i < NUMS; i++)
		{
			 
	         
			h.insert(GenerateStrings.getAlphaNumericString(limit));

		}
		System.out.println("Total Size " + h.size());
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/2000000);
	     
	    }
	     	
//	     for( int i = 0; i < NUMS; i++)
//	         H.remove( ""+i );
//     	
//	     for( int i = 0; i < NUMS; i++)
//	    	 System.out.print(H.contains(getAlphaNumericString(1)));
//	     	 
//	     
public static void task2(int NUMS, CuckooHashTable<String>h, int limit) 
{
	
    double search_start = 0, search_end = 0;

    System.out.println("Searching Started...");
    search_start = System.nanoTime();
  	
    for (int i = 0; i < NUMS; i++) {
    	String checker= GenerateStrings.getAlphaNumericString(limit);
//    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
        if (h.contains(checker)) {
            h.remove(checker);
//            System.out.println("String Removed");
        }
    }
    search_end = System.nanoTime();
    System.out.println("Average time for each search: " + (search_end - search_start) / NUMS + " nanoseconds");


}

}


