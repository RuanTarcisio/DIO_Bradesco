import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;



}
