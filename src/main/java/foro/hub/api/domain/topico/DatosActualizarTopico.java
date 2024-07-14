package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion) {
}
