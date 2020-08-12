package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Instalacao;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fatura
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-12T19:39:06.828Z")




public class Fatura   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("numero_leitura")
  private String numeroLeitura = null;

  @JsonProperty("data_vencimento")
  private OffsetDateTime dataVencimento = null;

  @JsonProperty("data_leitura")
  private OffsetDateTime dataLeitura = null;

  @JsonProperty("valor_conta")
  private BigDecimal valorConta = null;

  @JsonProperty("instalacao")
  private Instalacao instalacao = null;

  public Fatura id(Long id) {
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

  public Fatura codigo(String codigo) {
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

  public Fatura numeroLeitura(String numeroLeitura) {
    this.numeroLeitura = numeroLeitura;
    return this;
  }

  /**
   * Get numeroLeitura
   * @return numeroLeitura
  **/
  @ApiModelProperty(value = "")


  public String getNumeroLeitura() {
    return numeroLeitura;
  }

  public void setNumeroLeitura(String numeroLeitura) {
    this.numeroLeitura = numeroLeitura;
  }

  public Fatura dataVencimento(OffsetDateTime dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Get dataVencimento
   * @return dataVencimento
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(OffsetDateTime dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public Fatura dataLeitura(OffsetDateTime dataLeitura) {
    this.dataLeitura = dataLeitura;
    return this;
  }

  /**
   * Get dataLeitura
   * @return dataLeitura
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataLeitura() {
    return dataLeitura;
  }

  public void setDataLeitura(OffsetDateTime dataLeitura) {
    this.dataLeitura = dataLeitura;
  }

  public Fatura valorConta(BigDecimal valorConta) {
    this.valorConta = valorConta;
    return this;
  }

  /**
   * Get valorConta
   * @return valorConta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValorConta() {
    return valorConta;
  }

  public void setValorConta(BigDecimal valorConta) {
    this.valorConta = valorConta;
  }

  public Fatura instalacao(Instalacao instalacao) {
    this.instalacao = instalacao;
    return this;
  }

  /**
   * Get instalacao
   * @return instalacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instalacao getInstalacao() {
    return instalacao;
  }

  public void setInstalacao(Instalacao instalacao) {
    this.instalacao = instalacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fatura fatura = (Fatura) o;
    return Objects.equals(this.id, fatura.id) &&
        Objects.equals(this.codigo, fatura.codigo) &&
        Objects.equals(this.numeroLeitura, fatura.numeroLeitura) &&
        Objects.equals(this.dataVencimento, fatura.dataVencimento) &&
        Objects.equals(this.dataLeitura, fatura.dataLeitura) &&
        Objects.equals(this.valorConta, fatura.valorConta) &&
        Objects.equals(this.instalacao, fatura.instalacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, numeroLeitura, dataVencimento, dataLeitura, valorConta, instalacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fatura {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    numeroLeitura: ").append(toIndentedString(numeroLeitura)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataLeitura: ").append(toIndentedString(dataLeitura)).append("\n");
    sb.append("    valorConta: ").append(toIndentedString(valorConta)).append("\n");
    sb.append("    instalacao: ").append(toIndentedString(instalacao)).append("\n");
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

