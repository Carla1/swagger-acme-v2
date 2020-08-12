/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.15).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Instalacao;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-12T19:39:06.828Z")

@Api(value = "servico", description = "the servico API")
@RequestMapping(value = "/v2")
public interface ServicoApi {

    @ApiOperation(value = "Delete purchase Instalacao by ID", nickname = "deleteInstalacao", notes = "For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors", tags={ "servico", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Instalacao not found") })
    @RequestMapping(value = "/servico/instalacao/{instalacaoId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteInstalacao(@Min(1L)@ApiParam(value = "ID of the Instalacao that needs to be deleted",required=true) @PathVariable("instalacaoId") Long instalacaoId);


    @ApiOperation(value = "Find Instalacao by ID", nickname = "getInstalacaoById", notes = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions", response = Instalacao.class, tags={ "servico", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Instalacao.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found") })
    @RequestMapping(value = "/servico/instalacao/{instalacaoId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Instalacao> getInstalacaoById(@Min(1L) @Max(10L) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("instalacaoId") Long instalacaoId);


    @ApiOperation(value = "Instalacao", nickname = "placeInstalacao", notes = "", response = Instalacao.class, tags={ "servico", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Instalacao.class),
        @ApiResponse(code = 400, message = "Invalid Instalacao") })
    @RequestMapping(value = "/servico/instalacao",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Instalacao> placeInstalacao(@ApiParam(value = "Instalacao" ,required=true )  @Valid @RequestBody Instalacao body);

}