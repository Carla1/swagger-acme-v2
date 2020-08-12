package io.swagger.api;

import io.swagger.model.Endereco;
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
public class EnderecoApiController implements EnderecoApi {

    private static final Logger log = LoggerFactory.getLogger(EnderecoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EnderecoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEndereco(@ApiParam(value = "Endereco a ser adicionado" ,required=true )  @Valid @RequestBody Endereco body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteEndereco(@ApiParam(value = "endereco id to delete",required=true) @PathVariable("enderecoId") Long enderecoId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Endereco> getEnderecoById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("enderecoId") Long enderecoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Endereco>(objectMapper.readValue("<Endereco>  <id>123456789</id>  <bairro>aeiou</bairro>  <cidade>aeiou</cidade>  <logradouro>aeiou</logradouro>  <numero>123</numero>  <uf>aeiou</uf></Endereco>", Endereco.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Endereco>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Endereco>(objectMapper.readValue("{  \"uf\" : \"uf\",  \"cidade\" : \"cidade\",  \"numero\" : 2,  \"bairro\" : \"bairro\",  \"logradouro\" : \"logradouro\",  \"id\" : 5}", Endereco.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Endereco>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Endereco>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateEndereco(@ApiParam(value = "Endereco" ,required=true )  @Valid @RequestBody Endereco body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateEnderecoWithForm(@ApiParam(value = "Id",required=true) @PathVariable("enderecoId") Long enderecoId,@ApiParam(value = "cidade") @RequestParam(value="cidade", required=false)  String cidade) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
