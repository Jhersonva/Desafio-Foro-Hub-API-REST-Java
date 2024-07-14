package foro.hub.api.domain.topico;



import java.util.Date;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion
                                   ) {
}
