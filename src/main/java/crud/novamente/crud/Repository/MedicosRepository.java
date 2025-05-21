package crud.novamente.crud.Repository;

import crud.novamente.crud.Model.Medicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicosRepository extends JpaRepository<Medicos, Long> {


}
