package hospitalGeriatrico;
import java.time.LocalDate;

public class Paciente {
	
     private String nombreCompleto;
     private LocalDate fechaDeNacimiento;
     private String direccion;
     private int numeroTelefonico;
     private String curp;
     
     public void inicializacionPaciente(String nombreCompleto, LocalDate fechaDeNacimiento,
    		 int numeroTelefonico, String curp)
     {
    	 this.nombreCompleto = nombreCompleto;
    	 this.fechaDeNacimiento = fechaDeNacimiento;
    	 this.numeroTelefonico = numeroTelefonico;
    	 this.curp = curp;
     }
     
     public int setNumeroTelefonico()
     {
    	 return numeroTelefonico;
     } 
     
     public String setDireccion()
     {
    	 return direccion;
     } 
}
