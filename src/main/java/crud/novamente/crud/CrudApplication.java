package crud.novamente.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		System.out.println("funciona");

	}
	//TODO ajustar os codigos para o banco de dados mysql Workbench
	//TODO senha para isso é mysql -u root p senha root
	// create database o nome que esta o appro.
	// dps só rodar tudo pra ver se funciona
	// pensar em atualizar isso pro desafio usar o mysql no lugar do postgres

}
