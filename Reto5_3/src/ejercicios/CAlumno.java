package ejercicios;

import java.time.LocalDate;
import java.util.Arrays;

public class CAlumno {
	private String psNombre;
	private String psApellido1;
	private LocalDate pdNacimiento;
	private int piDni;
	private CAsignatura paoAsignatura [];
	private int paiNota [];
	
	
	public CAlumno(String psNombre, String psApellido1, LocalDate pdNacimiento, int piDni, CAsignatura[] paoAsignatura, int[] paiNota) {
		super();
		this.psNombre = psNombre;
		this.psApellido1 = psApellido1;
		this.pdNacimiento = pdNacimiento;
		this.piDni = piDni;
		this.paoAsignatura = paoAsignatura;
		this.paiNota = paiNota;
	}

	
	
	public String getPsNombre() {
		return psNombre;
	}



	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}



	public String getPsApellido1() {
		return psApellido1;
	}



	public void setPsApellido1(String psApellido1) {
		this.psApellido1 = psApellido1;
	}



	public LocalDate getPdNacimiento() {
		return pdNacimiento;
	}



	public void setPdNacimiento(LocalDate pdNacimiento) {
		this.pdNacimiento = pdNacimiento;
	}



	public int getPiDni() {
		return piDni;
	}



	public void setPiDni(int piDni) {
		this.piDni = piDni;
	}

	@Override
	public String toString() {
	    StringBuilder sbCAlumno = new StringBuilder();
	    sbCAlumno.append("CAlumno [psNombre=").append(psNombre)
	      .append(", psApellido1=").append(psApellido1)
	      .append(", pdNacimiento=").append(pdNacimiento)
	      .append(", piDni=").append(piDni)
	      .append(", paoAsignaturas=[");

	    // For para itinerar el array Asignaturas y agregar sus nombres a la cadena
	    for (int i = 0; i < paoAsignatura.length; i++) {
	        sbCAlumno.append(paoAsignatura[i].getPsNombre());
	        if (i < paoAsignatura.length - 1) {
	            sbCAlumno.append(", ");
	        }
	    }

	    sbCAlumno.append("], paiNota=").append(Arrays.toString(paiNota))
	      .append("]");
	    
	    return sbCAlumno.toString();
	}

//	@Override
//	public String toString() {
//		return "CAlumno [psNombre=" + psNombre + ", psApellido1=" + psApellido1 + ", pdNacimiento=" + pdNacimiento
//				+ ", piDni=" + piDni + ", paoAsignaturas=" + Arrays.toString(paoAsignatura) + ", paiNota="
//				+ Arrays.toString(paiNota) + "]";
//	}
	
}
