package shapes;

import static net.mindview.util.Print.print;

public class Shapes {
	public static int count = 0;
	// properties
	final float PI = 3.14f;
	
	public String name;
	public float circumference;
    public float area;
    public float volume;
    
    // constructor
    public Shapes() {
    	count++;
    }
    
    public void PrintName() {
    	print("\n\n===== Name = " + name + " =====");
    }
    
    public void PrintCircumference() {
        print("Circumference = " + circumference);
    }

    public void PrintArea() {
        print("Area = " + area);
    }
    
    public void PrintVolume() {
    	print("Volume = " + volume);
    }
}
