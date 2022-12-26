
public class Motor extends MotorluArac{

	public int motorHacmi = 1400;
	
	public Motor() {
		Motor.DisliSeti motorDisliSeti =new  Motor.DisliSeti();
		motorDisliSeti.calistir();
	}
	
	
	
	
	public class DisliSeti{
		
		public void calistir() {
			System.out.println("calistir() Metodu Çalıştı...");
			
		}
		
	}
}
