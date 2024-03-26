package cl.kubernetes.springcloud.msvc.cursos.clients;

import cl.kubernetes.springcloud.msvc.cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@FeignClient(name = "msvc-usuarios", url = "localhost:8001")
@FeignClient(name = "msvc-usuarios"/*, url = "${msvc.usuarios.url}"*/)
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    Usuario detalle(@PathVariable Long id);

    @PostMapping("/")
    Usuario crear(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    public List<Usuario> obtenerAlumnosPorCurso(@RequestParam List<Long> ids);
}
