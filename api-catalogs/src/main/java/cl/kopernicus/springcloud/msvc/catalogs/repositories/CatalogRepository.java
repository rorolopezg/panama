package cl.kopernicus.springcloud.msvc.catalogs.repositories;

import cl.kopernicus.springcloud.msvc.catalogs.models.entities.MapTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CatalogRepository extends JpaRepository<MapTable, Long> {
    Optional<List<MapTable>> findByMappingTypeAndSystemAAndCodeAAndSystemB(
            String mappingType,
            String systemA,
            String codeA,
            String SystemB
    );

    @Query("select mt from MapTable mt where mt.mappingType = ?1 and mt.systemA = ?2 and mt.systemB = ?4 and (mt.codeA = ?3 or ?3 is null)")
    Optional<List<MapTable>> findBySystemA(
            String mappingType,
            String systemA,
            String codeA,
            String systemB
    );

    @Query("select mt from MapTable mt where mt.mappingType = ?1 and mt.systemB = ?2 and mt.systemA = ?4 and (mt.codeB = ?3 or ?3 is null)")
    Optional<List<MapTable>> findBySystemB(
            String mappingType,
            String systemB,
            String codeB,
            String systemA
    );


}
