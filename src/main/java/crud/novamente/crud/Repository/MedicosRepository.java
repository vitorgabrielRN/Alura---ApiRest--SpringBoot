package crud.novamente.crud.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.novamente.crud.Medicos.Medicos;

import java.util.Optional;

@Repository
public interface MedicosRepository extends JpaRepository<Medicos, Long> {


    Page<Medicos> findAllByAtivoTrue(Pageable paginacao);
}