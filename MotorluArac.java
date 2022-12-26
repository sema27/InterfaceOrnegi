
public abstract class MotorluArac {
	
	public MotorluArac() {
		arizaKontrol();
	}
	
	int beygirGucu;
	public Motor mm;
	public Benzin b;
	
	public void motorCalistir(int a) {
		System.out.println("motorCalistir() Metodu Çalıştı...");
		
	}
	public boolean arizaKontrol() {
		System.out.println("Arıza Yok");
		return true;
		
	}
   
}
