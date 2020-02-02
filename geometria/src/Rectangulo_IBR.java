/**
 * 
 * @author Inma Burlo De Rojas
 * V.1.2
 *
 */

public class Rectangulo_IBR extends FiguraGeometrica_IBR {
	private double l1;
	private double l2;
	
	/**
	 * Contructor parametrizado de la clase, introduciendo tipo de
	 * figura, valor del lado grande y valor del lado pequeño. 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_IBR(String tipoFigura, double lG, double lP) 
	{
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula área con el valor de los lados
	 */
	@Override
	public double area() 
	{
		return l1 * l2;
	}
	
	/**
	 * Calcula perímetro con el valor de los lados.
	 */
	@Override
	public double perimetro() 
	{
		return (2 * l1) + (2 * l2);
	}

}
