package crud.novamente.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.novamente.crud.Medicos.Medicos;

@Repository
public interface MedicosRepository extends JpaRepository<Medicos, Long> {


}
