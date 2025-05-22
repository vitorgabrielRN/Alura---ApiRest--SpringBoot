package crud.novamente.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		System.out.println("funciona");

	}
	
	// para controlar os dados das coisas e infos boas! http://localhost:8080/medicos?size=1   Vai retornar apenas a primeira da lista, vide procurar por animes. sacou
   // para mudar as paginas http://localhost:8080/medicos?size=1  &page=1 usa esse daqui.
}

