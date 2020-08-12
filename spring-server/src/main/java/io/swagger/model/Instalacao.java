package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cliente;
import io.swagger.model.Endereco;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Instalacao
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-12T19:39:06.828Z")




public class Instalacao   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("data_instalacao")
  private OffsetDateTime dataInstalacao = null;

  @JsonProperty("cliente")
  private Cliente cliente = null;

  @JsonProperty("endereco")
  private Endereco endereco = null;

  public Instalacao id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instalacao codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(value = "")


  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Instalacao dataInstalacao(OffsetDateTime dataInstalacao) {
    this.dataInstalacao = dataInstalacao;
    return this;
  }

  /**
   * Get dataInstalacao
   * @return dataInstalacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataInstalacao() {
    return dataInstalacao;
  }

  public void setDataInstalacao(OffsetDateTime dataInstalacao) {
    this.dataInstalacao = dataInstalacao;
  }

  public Instalacao cliente(Cliente cliente) {
    this.cliente = cliente;
    return this;
  }

  /**
   * Get cliente
   * @return cliente
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Instalacao endereco(Endereco endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instalacao instalacao = (Instalacao) o;
    return Objects.equals(this.id, instalacao.id) &&
        Objects.equals(this.codigo, instalacao.codigo) &&
        Objects.equals(this.dataInstalacao, instalacao.dataInstalacao) &&
        Objects.equals(this.cliente, instalacao.cliente) &&
        Objects.equals(this.endereco, instalacao.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, dataInstalacao, cliente, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instalacao {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    dataInstalacao: ").append(toIndentedString(dataInstalacao)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

