package cl.kopernicus.springcloud.msvc.catalogs.services;

import cl.kopernicus.springcloud.msvc.catalogs.models.entities.MapTable;

import java.util.List;
import java.util.Optional;

public interface ApiCatalogsService {
    //Page<Usuario> listar(Pageable pageable);
    Optional<List<MapTable>> findBySystemA(String mappingType,String systemA, String codeA, String SystemB);
    Optional<List<MapTable>> findBySystemB(String mappingType,String systemB, String bCode, String SystemA);
}
