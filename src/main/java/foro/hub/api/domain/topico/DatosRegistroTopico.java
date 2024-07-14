package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;


import java.util.Date;


public record DatosRegistroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        Date fechaCreacion)
{
}
