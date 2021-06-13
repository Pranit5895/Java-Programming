package DeadLock;

public class DeadLock {

	public static void main(String[] args) {
		final String Test1 = "Pranit Gupta";  
	    final String Test2 = "Himanshu Gupta";  
	    final String Test3 = "Sarthak Srivastava";
	    
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (Test1) {  
	           System.out.println("Thread 1: locked resource 1");  
	           System.out.println(Test1);
	           try 
	           { 
	        	   Thread.sleep(100);
	           } 
	           catch (Exception e) 
	           {
	        	   
	           }  
	           synchronized (Test2) 
	           {
	        	   System.out.println("Thread 1: locked resource 2");  	        	   
	           }  
	           synchronized (Test3)
	           {
	        	   System.out.println("Thread 1 : locked resource 3");
	           }
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() 
	    {
	      public void run() 
	      {  
	        synchronized (Test2) 
	        {  
	          System.out.println("Thread 2: locked resource 2");  
	          System.out.println(Test2);
	          try 
	          { 
	        	  Thread.sleep(100);
	          }
	          catch (Exception e) 
	          {
	        	  
	          }  
	          synchronized (Test1) 
	          {
	        	  System.out.println("Thread 2: locked resource 1");  	        	  
	          }
	          synchronized (Test3)
	          {
	        	  System.out.println("Thread 2: locked resource 3");
	          }
	        }  
	      }  
	    }; 
	    
	    //t3 tries to lock resource3 then resource 
	    Thread t3 = new Thread() 
	    {
	      public void run() 
	      {  
	        synchronized (Test3) 
	        {  
	          System.out.println("Thread 3: locked resource 3");
	          System.out.println(Test3);
	          try 
	          { 
	        	  Thread.sleep(100);
	          }
	          catch (Exception e) 
	          {
	        	  
	          }  
	          synchronized (Test1) 
	          {
	        	  System.out.println("Thread 3: locked resource 1");  
	          }
	          synchronized (Test2)
	          {
	        	  System.out.println("Thread 3: locked resource 2");
	          }
	        }  
	      }  
	    }; 
	    
	    //
	    t1.start();  
	    t2.start();  	
	    t3.start();
	}
}
