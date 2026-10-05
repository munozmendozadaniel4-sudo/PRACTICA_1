package hospitalGeriatrico;
import java.time.LocalDate;


public class Consulta {
	
	private LocalDate fechaDeConsulta;
	private String diagnostico;
	private String receta;
	private Paciente paciente;
	
	 public void inicializacionConsulta(Paciente paciente, LocalDate fechaDeConsulta, String diagnostico,
    		 String receta) 
	 {
		 this.paciente = paciente;
		 this.fechaDeConsulta = fechaDeConsulta;
		 this.diagnostico = diagnostico;
		 this.receta = receta;
	 }

}
