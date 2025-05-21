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
	// TODO create database o nome que esta o appro.
	//TODO dps só rodar tudo pra ver se funciona
	// TODO pensar em atualizar isso pro desafio usar o mysql no lugar do postgres
	//TODO só consigo usar o push via interface do intelijj, pede senha e não sei fazer isos

}

