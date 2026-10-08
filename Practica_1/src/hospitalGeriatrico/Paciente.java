package hospitalGeriatrico;
import java.time.LocalDate;

public class Paciente {
	
     private String nombreCompleto;
     private LocalDate fechaDeNacimiento;
     private String direccion;
     private Long numeroTelefonico;
     private String curp;
     
     public void Paciente(String nombreCompleto, LocalDate fechaDeNacimiento, String curp)
     {
    	 this.nombreCompleto = nombreCompleto;
    	 this.fechaDeNacimiento = fechaDeNacimiento;
    	 this.curp = curp;
     }
     
     public Paciente(String nombreCompleto, LocalDate fechaDeNacimiento,
    		 Long numeroTelefonico, String curp)
     {
   
    	 this.nombreCompleto = nombreCompleto;
    	 this.fechaDeNacimiento = fechaDeNacimiento;
    	 this.numeroTelefonico = numeroTelefonico;
    	 this.curp = curp;
     }
     
     public Long setNumeroTelefonico()
     {
    	 return numeroTelefonico;
     } 
     
     public String setDireccion()
     {
    	 return direccion;
     } 
}
