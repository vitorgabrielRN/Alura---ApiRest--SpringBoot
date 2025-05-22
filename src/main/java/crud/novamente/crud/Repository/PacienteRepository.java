package crud.novamente.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.novamente.crud.Pacientes.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
