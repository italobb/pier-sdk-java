package br.com.conductor.pier.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoResponse   {
  
  private Integer bin = null;
  private Integer codRetorno = null;
  private String codigoDesbloqueio = null;
  private String criptografiaHSM = null;
  private Date dataEmissao = null;
  private Date dataValidade = null;
  private String dataVencimentoPadrao = null;
  private String descricaoRetorno = null;
  private Integer estagioCartao = null;
  private Date estagioData = null;
  private Boolean flagReversao = null;
  private Boolean flagSenha = null;
  private Integer idCartao = null;
  private Integer idConta = null;
  private Integer idEmissor = null;
  private String idLog = null;
  private Integer idPessoaFisica = null;
  private Integer idProduto = null;
  private String numeroCartao = null;
  private String numeroCartaoReal = null;
  private Integer statusCartao = null;
  private Date statusData = null;

  
  /**
   **/
  public CartaoResponse bin(Integer bin) {
    this.bin = bin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bin")
  public Integer getBin() {
    return bin;
  }
  public void setBin(Integer bin) {
    this.bin = bin;
  }

  
  /**
   **/
  public CartaoResponse codRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codRetorno")
  public Integer getCodRetorno() {
    return codRetorno;
  }
  public void setCodRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
  }

  
  /**
   **/
  public CartaoResponse codigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoDesbloqueio")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   **/
  public CartaoResponse criptografiaHSM(String criptografiaHSM) {
    this.criptografiaHSM = criptografiaHSM;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("criptografiaHSM")
  public String getCriptografiaHSM() {
    return criptografiaHSM;
  }
  public void setCriptografiaHSM(String criptografiaHSM) {
    this.criptografiaHSM = criptografiaHSM;
  }

  
  /**
   **/
  public CartaoResponse dataEmissao(Date dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEmissao")
  public Date getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(Date dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   **/
  public CartaoResponse dataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataValidade")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  public CartaoResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   **/
  public CartaoResponse descricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoRetorno")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  public CartaoResponse estagioCartao(Integer estagioCartao) {
    this.estagioCartao = estagioCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estagioCartao")
  public Integer getEstagioCartao() {
    return estagioCartao;
  }
  public void setEstagioCartao(Integer estagioCartao) {
    this.estagioCartao = estagioCartao;
  }

  
  /**
   **/
  public CartaoResponse estagioData(Date estagioData) {
    this.estagioData = estagioData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estagioData")
  public Date getEstagioData() {
    return estagioData;
  }
  public void setEstagioData(Date estagioData) {
    this.estagioData = estagioData;
  }

  
  /**
   **/
  public CartaoResponse flagReversao(Boolean flagReversao) {
    this.flagReversao = flagReversao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagReversao")
  public Boolean getFlagReversao() {
    return flagReversao;
  }
  public void setFlagReversao(Boolean flagReversao) {
    this.flagReversao = flagReversao;
  }

  
  /**
   **/
  public CartaoResponse flagSenha(Boolean flagSenha) {
    this.flagSenha = flagSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagSenha")
  public Boolean getFlagSenha() {
    return flagSenha;
  }
  public void setFlagSenha(Boolean flagSenha) {
    this.flagSenha = flagSenha;
  }

  
  /**
   **/
  public CartaoResponse idCartao(Integer idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCartao")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public CartaoResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public CartaoResponse idEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEmissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  public CartaoResponse idLog(String idLog) {
    this.idLog = idLog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idLog")
  public String getIdLog() {
    return idLog;
  }
  public void setIdLog(String idLog) {
    this.idLog = idLog;
  }

  
  /**
   **/
  public CartaoResponse idPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idPessoaFisica")
  public Integer getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  public CartaoResponse idProduto(Integer idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idProduto")
  public Integer getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Integer idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   **/
  public CartaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  public CartaoResponse numeroCartaoReal(String numeroCartaoReal) {
    this.numeroCartaoReal = numeroCartaoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCartaoReal")
  public String getNumeroCartaoReal() {
    return numeroCartaoReal;
  }
  public void setNumeroCartaoReal(String numeroCartaoReal) {
    this.numeroCartaoReal = numeroCartaoReal;
  }

  
  /**
   **/
  public CartaoResponse statusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCartao")
  public Integer getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   **/
  public CartaoResponse statusData(Date statusData) {
    this.statusData = statusData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusData")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoResponse cartaoResponse = (CartaoResponse) o;
    return Objects.equals(this.bin, cartaoResponse.bin) &&
        Objects.equals(this.codRetorno, cartaoResponse.codRetorno) &&
        Objects.equals(this.codigoDesbloqueio, cartaoResponse.codigoDesbloqueio) &&
        Objects.equals(this.criptografiaHSM, cartaoResponse.criptografiaHSM) &&
        Objects.equals(this.dataEmissao, cartaoResponse.dataEmissao) &&
        Objects.equals(this.dataValidade, cartaoResponse.dataValidade) &&
        Objects.equals(this.dataVencimentoPadrao, cartaoResponse.dataVencimentoPadrao) &&
        Objects.equals(this.descricaoRetorno, cartaoResponse.descricaoRetorno) &&
        Objects.equals(this.estagioCartao, cartaoResponse.estagioCartao) &&
        Objects.equals(this.estagioData, cartaoResponse.estagioData) &&
        Objects.equals(this.flagReversao, cartaoResponse.flagReversao) &&
        Objects.equals(this.flagSenha, cartaoResponse.flagSenha) &&
        Objects.equals(this.idCartao, cartaoResponse.idCartao) &&
        Objects.equals(this.idConta, cartaoResponse.idConta) &&
        Objects.equals(this.idEmissor, cartaoResponse.idEmissor) &&
        Objects.equals(this.idLog, cartaoResponse.idLog) &&
        Objects.equals(this.idPessoaFisica, cartaoResponse.idPessoaFisica) &&
        Objects.equals(this.idProduto, cartaoResponse.idProduto) &&
        Objects.equals(this.numeroCartao, cartaoResponse.numeroCartao) &&
        Objects.equals(this.numeroCartaoReal, cartaoResponse.numeroCartaoReal) &&
        Objects.equals(this.statusCartao, cartaoResponse.statusCartao) &&
        Objects.equals(this.statusData, cartaoResponse.statusData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, codRetorno, codigoDesbloqueio, criptografiaHSM, dataEmissao, dataValidade, dataVencimentoPadrao, descricaoRetorno, estagioCartao, estagioData, flagReversao, flagSenha, idCartao, idConta, idEmissor, idLog, idPessoaFisica, idProduto, numeroCartao, numeroCartaoReal, statusCartao, statusData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    codRetorno: ").append(toIndentedString(codRetorno)).append("\n");
    sb.append("    codigoDesbloqueio: ").append(toIndentedString(codigoDesbloqueio)).append("\n");
    sb.append("    criptografiaHSM: ").append(toIndentedString(criptografiaHSM)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
    sb.append("    estagioCartao: ").append(toIndentedString(estagioCartao)).append("\n");
    sb.append("    estagioData: ").append(toIndentedString(estagioData)).append("\n");
    sb.append("    flagReversao: ").append(toIndentedString(flagReversao)).append("\n");
    sb.append("    flagSenha: ").append(toIndentedString(flagSenha)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idLog: ").append(toIndentedString(idLog)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    numeroCartaoReal: ").append(toIndentedString(numeroCartaoReal)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    statusData: ").append(toIndentedString(statusData)).append("\n");
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



