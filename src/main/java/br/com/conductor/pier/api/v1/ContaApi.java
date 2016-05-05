package br.com.conductor.pier.api.v1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiClient;
import br.com.conductor.pier.api.v1.invoker.Configuration;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.ConsultarContaResponse;
import br.com.conductor.pier.api.v1.model.ContaResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class ContaApi {
  private ApiClient apiClient;

  public ContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * /contas/buscar
   * Consulte contas filtrando pelos campos id do emissor, n\u00C3\u00BAmero do cart\u00C3\u00A3o, nome ou CPF/CNPJ 
   * @param nome Nome
   * @param cpf CPF (opcional caso nao informe o n\u00C3\u00BAmero do cart\u00C3\u00A3o ou id da conta)
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o (opcional caso n\u00C3\u00A3o informa o cpf ou id da conta)
   * @param idConta ID da Conta (opcional caso n\u00C3\u00A3o informe o n\u00C3\u00BAmero do cart\u00C3\u00A3o ou cpf)
   * @return ConsultarContaResponse
   */
  public ConsultarContaResponse buscarContaUsingGET(String nome, String cpf, String numeroCartao, Long idConta) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/v1/contas/buscar".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ConsultarContaResponse> returnType = new GenericType<ConsultarContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}
   * Consulte informa\u00C3\u00A7\u00C3\u00B5es de uma determinada conta
   * @param idConta ID da Conta
   * @return ContaResponse
   */
  public ContaResponse consultarContaUsingGET(Integer idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarContaUsingGET");
     }
     
    // create path and map variables
    String path = "/v1/contas/{idConta}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

