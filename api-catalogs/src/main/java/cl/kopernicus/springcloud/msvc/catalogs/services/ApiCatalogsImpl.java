package cl.kopernicus.springcloud.msvc.catalogs.services;

import cl.kopernicus.springcloud.msvc.catalogs.models.entities.MapTable;
import cl.kopernicus.springcloud.msvc.catalogs.repositories.CatalogRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

@Service
public class ApiCatalogsImpl implements ApiCatalogsService {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ApiCatalogsImpl.class);
    @Autowired
    private CatalogRepository repository;

    /*
    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> listar(Pageable pageable) {
        return repository.findAll(pageable);
    }
    */

    @Override
    @Transactional(readOnly = true)
    public Optional<List<MapTable>> findBySystemA(
            String mappingType, String systemA, String codeA, String systemB ) {
        String message = MessageFormat
                .format("mappingType: ''{0}'', systemA: ''{1}'', codeA: ''{2}'', systemB: ''{3}''",
                        mappingType, systemA, codeA, systemB);
        log.info(message);
        //return repository.findByMappingTypeAndSystemAAndCodeAAndSystemB(mappingType, systemA, codeA, systemB);
        return repository.findBySystemA(mappingType, systemA, codeA, systemB);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<MapTable>> findBySystemB(
            String mappingType, String systemB, String codeB, String systemA ) {
        String message = MessageFormat
                .format("mappingType: ''{0}'', systemB: ''{1}'', codeB: ''{2}'', systemA: ''{3}''",
                        mappingType, systemB, codeB, systemA);
        log.info(message);
        //return repository.findByMappingTypeAndSystemAAndCodeAAndSystemB(mappingType, systemA, codeA, systemB);
        return repository.findBySystemB(mappingType, systemB, codeB, systemA);
    }
}
