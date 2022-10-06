package com.vidaaustista.bootcamp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vidaaustista.bootcamp.entity.JornadaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class UsuarioDTO {

    @JsonProperty
    private Integer idUsuario;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("data_nascimento")
    private Date dataNascimento;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("senha")
    private String senha;

    @JsonProperty("flag_profissional_saude")
    private Boolean flagProfissionalSaude;

    @JsonProperty("documento_identificacao")
    private String documentoIdentificacao;

    @JsonProperty("jornadas")
    private List<JornadaEntity> jornadas;

    public String toString() {
        return idUsuario+";"+nome+";"+email;
    }

}
