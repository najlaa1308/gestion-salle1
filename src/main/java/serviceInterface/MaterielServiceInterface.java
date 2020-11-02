package serviceInterface;

import entity.Materiel;

import java.util.List;
import java.util.Optional;

public interface MaterielServiceInterface {
    public Optional<Materiel> findbyId(Long id);
    public List<Materiel> findall();
    public int save(Materiel materiel);
    public void delete(Materiel materiel);
}
