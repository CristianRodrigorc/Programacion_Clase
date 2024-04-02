package ejercicios;

public class CAsignatura {
	private int piCodigo;
	private String psNombre;
	private CProfesor poProfesor;
	private int piHorasSemanales;
	
	public CAsignatura(int piCodigo, String psNombre, CProfesor poProfesor, int piHorasSemanales) {
		super();
		this.piCodigo = piCodigo;
		this.psNombre = psNombre;
		this.poProfesor = poProfesor;
		this.piHorasSemanales = piHorasSemanales;
	}

	public int getPiCodigo() {
		return piCodigo;
	}

	public void setPiCodigo(int piCodigo) {
		this.piCodigo = piCodigo;
	}

	public String getPsNombre() {
		return psNombre;
	}

	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}

	public CProfesor getPoProfesor() {
		return poProfesor;
	}

	public void setPoProfesor(CProfesor poProfesor) {
		this.poProfesor = poProfesor;
	}

	public int getPiHorasSemanales() {
		return piHorasSemanales;
	}

	public void setPiHorasSemanales(int piHorasSemanales) {
		this.piHorasSemanales = piHorasSemanales;
	}
}
