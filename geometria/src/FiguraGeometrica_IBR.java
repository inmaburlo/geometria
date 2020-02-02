
public abstract class FiguraGeometrica_IBR {

	protected String tipoFigura;

	public FiguraGeometrica_IBR(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
