//Version inicial
public class Circulo_IBR extends FiguraGeometrica_IBR {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_IBR(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	    if (r<0) 
	    {
	    	r*=-1;
	    }
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
