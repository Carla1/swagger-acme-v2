package io.swagger.api;

import io.swagger.model.Fatura;
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
public class CaixaApiController implements CaixaApi {

    private static final Logger log = LoggerFactory.getLogger(CaixaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CaixaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addFatura(@ApiParam(value = "Fatura a ser adicionada" ,required=true )  @Valid @RequestBody Fatura body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteFatura(@ApiParam(value = "Fatura id to delete",required=true) @PathVariable("faturaId") Long faturaId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Fatura> getFaturaById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("faturaId") Long faturaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Fatura>(objectMapper.readValue("<Fatura>  <id>123456789</id>  <codigo>aeiou</codigo>  <numero_leitura>aeiou</numero_leitura>  <data_vencimento>2000-01-23T04:56:07.000Z</data_vencimento>  <data_leitura>2000-01-23T04:56:07.000Z</data_leitura>  <valor_conta>1.3579</valor_conta></Fatura>", Fatura.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Fatura>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Fatura>(objectMapper.readValue("{  \"codigo\" : \"codigo\",  \"data_leitura\" : \"2000-01-23T04:56:07.000+00:00\",  \"instalacao\" : {    \"cliente\" : {      \"endereco\" : {        \"uf\" : \"uf\",        \"cidade\" : \"cidade\",        \"numero\" : 2,        \"bairro\" : \"bairro\",        \"logradouro\" : \"logradouro\",        \"id\" : 5      },      \"data_nascimento\" : \"2000-01-23T04:56:07.000+00:00\",      \"cpf\" : \"cpf\",      \"nome\" : \"nome\",      \"id\" : 5    },    \"codigo\" : \"codigo\",    \"data_instalacao\" : \"2000-01-23T04:56:07.000+00:00\",    \"endereco\" : {      \"uf\" : \"uf\",      \"cidade\" : \"cidade\",      \"numero\" : 2,      \"bairro\" : \"bairro\",      \"logradouro\" : \"logradouro\",      \"id\" : 5    },    \"id\" : 1  },  \"numero_leitura\" : \"numero_leitura\",  \"id\" : 0,  \"data_vencimento\" : \"2000-01-23T04:56:07.000+00:00\",  \"valor_conta\" : 6.02745618307040320615897144307382404804229736328125}", Fatura.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Fatura>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Fatura>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateFatura(@ApiParam(value = "Fatura" ,required=true )  @Valid @RequestBody Fatura body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateFaturaWithForm(@ApiParam(value = "Id",required=true) @PathVariable("faturaId") Long faturaId,@ApiParam(value = "Codigo") @RequestParam(value="codigo", required=false)  String codigo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
