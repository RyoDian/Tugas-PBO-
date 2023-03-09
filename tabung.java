public class tabung {
  public static void main(String[] args) {
    double d,v;
	double r, t;
	float phi=3.14f;
	d = 5.0;
    r = d / 2.0;
    t = 10.0;

    v = phi * r* t;
	

	System.out.println("--- Tabung ---");
	System.out.println("Phi : "+phi);
	System.out.println("Diameter: "+d);
	System.out.println("Jari : "+r);
	System.out.println("Volume : "+v);
  }
}