package SeleniumPractice;

class Bike{  
    void run(){System.out.println("running");}  
  }  
  class Splender extends Bike{  
    void run(){System.out.println("running safely with 60km");}  
    
    public static void main(String args[]){  
    	factory f = new factory();
    	
    	Bike s = f.getMethod(2);
    	Bike s1 = new Splender();
    	s.run();
    }  
  } 
  
  class factory{  
	    //void run(){System.out.println("running");}  
	  public Bike getMethod(int a){
		  if(a % 2 == 0){
			  return new Splender();
		  }else{
			  return new Bike();
		  }
	  }
	  }   