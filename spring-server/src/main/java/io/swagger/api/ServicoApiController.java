package io.swagger.api;

import io.swagger.model.Instalacao;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-12T19:39:06.828Z")

@Controller
public class ServicoApiController implements ServicoApi {

    private static final Logger log = LoggerFactory.getLogger(ServicoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServicoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteInstalacao(@Min(1L)@ApiParam(value = "ID of the Instalacao that needs to be deleted",required=true) @PathVariable("instalacaoId") Long instalacaoId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Instalacao> getInstalacaoById(@Min(1L) @Max(10L) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("instalacaoId") Long instalacaoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("<Instalacao>  <id>123456789</id>  <codigo>aeiou</codigo>  <data_instalacao>2000-01-23T04:56:07.000Z</data_instalacao></Instalacao>", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("{  \"cliente\" : {    \"endereco\" : {      \"uf\" : \"uf\",      \"cidade\" : \"cidade\",      \"numero\" : 2,      \"bairro\" : \"bairro\",      \"logradouro\" : \"logradouro\",      \"id\" : 5    },    \"data_nascimento\" : \"2000-01-23T04:56:07.000+00:00\",    \"cpf\" : \"cpf\",    \"nome\" : \"nome\",    \"id\" : 5  },  \"codigo\" : \"codigo\",  \"data_instalacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"endereco\" : {    \"uf\" : \"uf\",    \"cidade\" : \"cidade\",    \"numero\" : 2,    \"bairro\" : \"bairro\",    \"logradouro\" : \"logradouro\",    \"id\" : 5  },  \"id\" : 1}", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Instalacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Instalacao> placeInstalacao(@ApiParam(value = "Instalacao" ,required=true )  @Valid @RequestBody Instalacao body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("<Instalacao>  <id>123456789</id>  <codigo>aeiou</codigo>  <data_instalacao>2000-01-23T04:56:07.000Z</data_instalacao></Instalacao>", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("{  \"cliente\" : {    \"endereco\" : {      \"uf\" : \"uf\",      \"cidade\" : \"cidade\",      \"numero\" : 2,      \"bairro\" : \"bairro\",      \"logradouro\" : \"logradouro\",      \"id\" : 5    },    \"data_nascimento\" : \"2000-01-23T04:56:07.000+00:00\",    \"cpf\" : \"cpf\",    \"nome\" : \"nome\",    \"id\" : 5  },  \"codigo\" : \"codigo\",  \"data_instalacao\" : \"2000-01-23T04:56:07.000+00:00\",  \"endereco\" : {    \"uf\" : \"uf\",    \"cidade\" : \"cidade\",    \"numero\" : 2,    \"bairro\" : \"bairro\",    \"logradouro\" : \"logradouro\",    \"id\" : 5  },  \"id\" : 1}", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Instalacao>(HttpStatus.NOT_IMPLEMENTED);
    }

}
