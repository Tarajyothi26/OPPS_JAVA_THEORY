Polymorphism is a core concept in object-oriented programming 
that allows a single action to be performed in different ways. 
The word itself comes from Greek roots meaning "many forms". In Java, 
this means that objects can take on various behaviors depending on their
context, which enhances code reusability, flexibility, and extensibility

CODE:

package Com.Sample;
class RBI{
	public double getRateOfInterest(){
	return 5.0;
	}
}
class SBI extends RBI{
	public double getRateOfInterest() {
		return 6.5;
	}
}
class ICICI extends RBI{
	public double getRateOfInterest() {
		return 7.5;
	}
}

public class Bank {

	public static void main(String[] args) {
		RBI rb=new RBI();
		System.out.println("RBI rate of interest: " + rb.getRateOfInterest());
		RBI rbi=new SBI();
		System.out.println("SBI rate of interest using upcasting: "+ rbi.getRateOfInterest());
		SBI sb=new SBI();
		System.out.println("SBI rate of interest: "+sb.getRateOfInterest());
		ICICI ic=new ICICI();
		System.out.println("ICICI rate of interest: "+ic.getRateOfInterest());
	}
	
}

OUTPUT:
RBI rate of interest: 5.0
SBI rate of interest using upcasting: 6.5
SBI rate of interest: 6.5
ICICI rate of interest: 7.5
