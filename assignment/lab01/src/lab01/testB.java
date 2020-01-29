package lab01;

import searchtrees.AVLTree;
import searchtrees.BinarySearchTree;
import searchtrees.RedBlackBST;
import searchtrees.SplayTree;

/**
 * @author salehin
 *
 */
public class testB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     BinarySearchTree<Integer> t = new BinarySearchTree<>( );
		     AVLTree<Integer> h = new AVLTree<>( );
		     RedBlackBST<Integer, Integer> i = new RedBlackBST<Integer, Integer>();
		     SplayTree<Integer> j = new SplayTree<Integer>( );
		     final int NUMS = 100000;  // must be even
		     GenerateInt generateInt = new GenerateInt();
		     System.out.println( "Create the tree..." );

		     int rd=0;
		   //  Random r = new Random();
		     System.out.println("BINARY TREE START");
//			 Binary ( 4 a 4 b 5c )
		     task1(NUMS, t, generateInt); //4A
		     task2(NUMS, t);			  //4B	
		     task3(NUMS, t);			  //4C
		     task01(NUMS, t, generateInt);      //5A
		     task2(NUMS, t);			     	//5B
		     task4(NUMS, t);   			  		//5C
		     System.out.println("AVL TREE START");		     
//			 AVL TREE ( 4 a 4 b 5c )	  
		     task11(NUMS, h, generateInt); //4A
		     task22(NUMS, h);			   //4B	
		     task03(NUMS, h);			   //4C
		     task011(NUMS, h, generateInt);		//5A
		     task22(NUMS, h);			   		//5B
		     task33(NUMS, h);			        //5C
		     System.out.println("RED BLAST BST TREE START");
// 			 RED BLAST ( 4 a 4 b 5c )
		     task111(NUMS, i, generateInt);//4A
		     task222(NUMS, i);			   //4B 
		     task033(NUMS, i);			   //4C
		     task0111(NUMS, i, generateInt);    //5A
		     task222(NUMS, i);			   	    //5B
		     task333(NUMS, i);			        //5C
		     System.out.println("SPLAY TREE START");
//			 SplayTree ( 4 a 4 b 5c )
		     task1111(NUMS, j, generateInt);//4A 
		     task2222(NUMS, j);             //4B 
		     task03333(NUMS, j);			//4C
             task01111(NUMS, j, generateInt);    //5A		     
		     task2222(NUMS, j);                  //5B
		     task3333(NUMS, j);				     //5C
	}




	private static void task01111(int nUMS, SplayTree<Integer> j, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		
		 long start = System.nanoTime();
		    System.out.println( "Fill in the table...Splay Tree" );
		    int count=1;
			for( int i = 1; i <= nUMS; i++)
			{
				 		         
				j.insert(GenerateInt.generateNumber());
//				System.out.println(GenerateInt.generateNumber());
				count = i;

			}
			System.out.println("Total Size " + count);
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);


		
	}




	private static void task03333(int nUMS, SplayTree<Integer> j) {
		// TODO Auto-generated method stub

		long start = System.nanoTime();
	    System.out.println( "Deletion in the table..." );
	    int count=0;
		for( int i = 1; i <= nUMS; i++)
		{
			if(j.isEmpty() == false)
			{
			
			j.remove(i);
			
			}
//			System.out.println(GenerateInt.generateNumber());

		}
		System.out.println("Total Size " + count);
		System.out.println("Is it empty " + j.isEmpty());
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/nUMS);
	}




	private static void task0111(int nUMS, RedBlackBST<Integer, Integer> i, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
	    System.out.println( "Fill in the table...RedBlast BST Tree" );
	    int count=1;
		for( int z = 1; z <= nUMS; z++)
		{
			 		         
			i.put(GenerateInt.generateNumber(), GenerateInt.generateNumber());
//			System.out.println(GenerateInt.generateNumber());
			count = z;

		}
		System.out.println("Total Size " + count);
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/nUMS);

		
	}




	private static void task033(int nUMS, RedBlackBST<Integer, Integer> i) {
		// TODO Auto-generated method stub
		
		long start = System.nanoTime();
	    System.out.println( "Deletion in the table..." );
	    int count=0;
		for( int j = 1; j <= nUMS; j++)
		{
			if(i.isEmpty() == false)
			{
			
			i.delete(j);
			
			}
//			System.out.println(GenerateInt.generateNumber());

		}
		System.out.println("Total Size " + count);
		System.out.println("Is it empty " + i.isEmpty());
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/nUMS);


		
	}




	private static void task011(int nUMS, AVLTree<Integer> h, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		 long start = System.nanoTime();
		    System.out.println( "Fill in the table...Binary Tree" );
		    int count=1;
			for( int i = 1; i <= nUMS; i++)
			{
				 		         
				h.insert(GenerateInt.generateNumber());
//				System.out.println(GenerateInt.generateNumber());
				count = i;

			}
			System.out.println("Total Size " + count);
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);

		
	}




	private static void task03(int nUMS, AVLTree<Integer> h) {
		// TODO Auto-generated method stub
		 long start = System.nanoTime();
		    System.out.println( "Deletion in the table..." );
		    int count=0;
			for( int i = 1; i <= nUMS; i++)
			{
				if(h.isEmpty() == false)
				{
				
				h.remove(i);
				
				}
//				System.out.println(GenerateInt.generateNumber());

			}
			System.out.println("Total Size " + count);
			System.out.println("Is it empty " + h.isEmpty());
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);

		
	}



	private static void task01(int nUMS, BinarySearchTree<Integer> t, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		
		 long start = System.nanoTime();
		    System.out.println( "Fill in the table...Binary Tree" );
		    int count=1;
			for( int i = 1; i <= nUMS; i++)
			{
				 		         
				t.insert(GenerateInt.generateNumber());
//				System.out.println(GenerateInt.generateNumber());
				count = i;

			}
			System.out.println("Total Size " + count);
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);
		     
		    }
		
	



	private static void task4(int nUMS, BinarySearchTree<Integer> t) {
		// TODO Auto-generated method stub
		
		double search_start = 0, search_end = 0;

	    System.out.println("SPLAY DELETION Started...");
	    search_start = System.nanoTime();
	    int count = 0;
	  	
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (t.contains(checker)) {
	            t.remove(checker);
//	            System.out.println("INT Removed");
	            count++;
	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each deletion: " + (search_end - search_start) / nUMS + " nanoseconds");
	    
	    System.out.println("TOTAL REMOVES" + count);

		
		
	}



	private static void task3333(int nUMS, SplayTree<Integer> j) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		double search_start = 0, search_end = 0;

	    System.out.println("SPLAY DELETION Started...");
	    search_start = System.nanoTime();
	    int count = 0;
	  	
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (j.contains(checker)) {
	            j.remove(checker);
//	            System.out.println("INT Removed");
	            count++;
	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each deletion: " + (search_end - search_start) / nUMS + " nanoseconds");
	    
	    System.out.println("TOTAL REMOVES" + count);

		
	}



	private static void task2222(int nUMS, SplayTree<Integer> j) {
		// TODO Auto-generated method stub
		System.out.println("SPLAY Started Search...");
	    double search_start = 0, search_end = 0;
	    int totalkeymatched = 0;

	    search_start = System.nanoTime();
	    
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
	    	
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (j.contains(checker)) {
	
//	            System.out.println("Key Matches");
	            totalkeymatched++;
	         	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");
	    System.out.println("TOTAL MATCHES " + totalkeymatched);

	}



	private static void task1111(int nUMS, SplayTree<Integer> j, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
	    System.out.println( "Fill in the table...SPLAY TREE" );
	    int count=0;
		for( int z = 1; z <= nUMS; z++)
		{
			 		         
			j.insert(z);
			count = z;
//			System.out.println(GenerateInt.generateNumber());

		}
		System.out.println("Total Size " + count);
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/nUMS);

	}



	private static void task111(int nUMS, RedBlackBST<Integer, Integer> i, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
	    System.out.println( "Fill in the table...RED BLAST BST TREE" );
	    int count=0;
		for( int z = 1; z <= nUMS; z++)
		{
			 		         
			i.put(z, z);
			count = z;
//			System.out.println(GenerateInt.generateNumber());

		}
		System.out.println("Total Size " + count);
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime + " NanoSeconds");
		System.out.println("Average Time " + elapsedTime/nUMS);

	}



	private static void task222(int nUMS, RedBlackBST<Integer, Integer> i) {
		// TODO Auto-generated method stub
		System.out.println("RED BLAST BST Started Search...");
	    double search_start = 0, search_end = 0;
	    int totalkeymatched = 0;

	    search_start = System.nanoTime();
	    
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
	    	
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (i.contains(checker)) {
	
//	            System.out.println("Key Matches");
	            totalkeymatched++;
	         	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");
	    System.out.println("TOTAL MATCHES " + totalkeymatched);

	}



	private static void task333(int nUMS, RedBlackBST<Integer, Integer> i) {
		// TODO Auto-generated method stub
		double search_start = 0, search_end = 0;

	    System.out.println("RED BLAST BST DELETION Started...");
	    search_start = System.nanoTime();
	    int count = 0;
	  	
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (i.contains(checker)) {
	            i.delete(checker);
//	            System.out.println("INT Removed");
	            count++;
	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each deletion: " + (search_end - search_start) / nUMS + " nanoseconds");
	    
	    System.out.println("TOTAL REMOVES" + count);

		
	}



	private static void task33(int nUMS, AVLTree<Integer> h) {
		// TODO Auto-generated method stub
		
	    double search_start = 0, search_end = 0;

	    System.out.println("AVL DELETION Started...");
	    search_start = System.nanoTime();
	    int count = 0;
	  	
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (h.contains(checker)) {
	            h.remove(checker);
//	            System.out.println("INT Removed");
	            count++;
	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each deletion: " + (search_end - search_start) / nUMS + " nanoseconds");
	    
	    System.out.println("TOTAL REMOVES" + count);
		     
	}

	private static void task22(int nUMS, AVLTree<Integer> h) {
		// TODO Auto-generated method stub
		
		System.out.println("AVL Started...");
	    double search_start = 0, search_end = 0;
	    int totalkeymatched = 0;

	    search_start = System.nanoTime();
	    
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
	    	
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (h.contains(checker)) {
	
//	            System.out.println("Key Matches");
	            totalkeymatched++;
	         	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");
	    System.out.println("TOTAL MATCHES " + totalkeymatched);
		
		
	}

	private static void task11(int nUMS, AVLTree<Integer> h, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		
		 	long start = System.nanoTime();
		    System.out.println( "Fill in the table...AVL TREE" );
		    int count=0;
			for( int i = 1; i <= nUMS; i++)
			{
				 		         
				h.insert(i);
				count = i;
//				System.out.println(GenerateInt.generateNumber());

			}
			System.out.println("Total Size " + count);
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);

		
	}

	private static void task3(int nUMS, BinarySearchTree<Integer> t) {
		// TODO Auto-generated method stub
		
		 long start = System.nanoTime();
		    System.out.println( "Deletion in the table..." );
		    int count=0;
			for( int i = 1; i <= nUMS; i++)
			{
				if(t.isEmpty() == false)
				{
				
				t.remove(i);
				
				}
//				System.out.println(GenerateInt.generateNumber());

			}
			System.out.println("Total Size " + count);
			System.out.println("Is it empty " + t.isEmpty());
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);
		     
		    }


	private static void task2(int nUMS, BinarySearchTree<Integer> t) {
		// TODO Auto-generated method stub
		System.out.println("Binary Search Started...");
	    double search_start = 0, search_end = 0;
	    int totalkeymatched = 0;

	    search_start = System.nanoTime();
	    
	    for (int z = 0; z < nUMS; z++) {
	    	int checker= GenerateInt.generateNumber();
	    	
//	    	System.out.println(GenerateStrings.getAlphaNumericString(limit));
	        if (t.contains(checker)) {
	
//	            System.out.println("Key Matches");
	            totalkeymatched++;
	         	        }
	    }
	    search_end = System.nanoTime();
	    System.out.println("Average time for each search: " + (search_end - search_start) / nUMS + " nanoseconds");
	    System.out.println("TOTAL MATCHES " + totalkeymatched);
		
	}

	private static void task1(int nUMS, BinarySearchTree<Integer> t, GenerateInt generateInt) {
		// TODO Auto-generated method stub
		 long start = System.nanoTime();
		    System.out.println( "Fill in the table...Binary Tree" );
		    int count=1;
			for( int i = 1; i <= nUMS; i++)
			{
				 		         
				t.insert(i);
//				System.out.println(i);
				count = i;

			}
			System.out.println("Total Size " + count);
			long end = System.nanoTime();;
			long elapsedTime = end - start;
			System.out.println(elapsedTime + " NanoSeconds");
			System.out.println("Average Time " + elapsedTime/nUMS);
		     
		    }

	}


