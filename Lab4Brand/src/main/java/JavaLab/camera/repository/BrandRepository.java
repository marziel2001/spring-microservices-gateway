package JavaLab.camera.repository;

import JavaLab.camera.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID> {

    Optional<Brand> findAllByName(String name);

    List<Brand> findAll();

}
