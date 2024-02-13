## Descrição geral 
A API Autopeças é uma aplicação que permite gerenciar os produtos de uma loja. 
Ela fornece endpoints para cadastrar, recuperar, atualizar e excluir produtos do catálogo.

## Como utilizar? 
<p>Você pode fazer requisiçoes para a api da autopeças utilizando o <b>postman</b> para a realização de um acesso rápido e ágil a todos os verbos HTTPS</p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303426768-637d5ff6-bb9c-4765-b08b-26326389c588.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T172722Z&X-Amz-Expires=300&X-Amz-Signature=a3153a7e4368aad4cb02222613aa26d529e39a845152bd4f280314a8afcb864f&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

Para baixar o Postman, clique neste <a href="facebook.com" href="_blank">link</a> <b>(Você sera redirecionado)</b> 


## Endpoints
<p>Nossa api conta com os seguintes endpoints</p>

### 1. Cadastrar produto 
<p>• URL: /autopecas</p>
<p>• Verbo HTTP: 'POST'</p>
<p>• Exemplo de Solicitação via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/304134668-c98e54d3-17a8-40bd-9c50-d154637208ec.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240212%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240212T152140Z&X-Amz-Expires=300&X-Amz-Signature=30d7d8dee2186cabef428a99b207d5c584fceaf924458b71927563195dfe2a56&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

<p>• Exemplo de resposta <b>(Sucesso)</b> via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303425424-14d38cc1-e9d1-43a1-9239-a5f91bb10cde.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T172230Z&X-Amz-Expires=300&X-Amz-Signature=54373833394f77aa9626631c8ee4720ece1ad30476d4e2909560d5a286b7e4d0&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">


### 2. Recuperar produtos
<p>• URL: /autopecas</p>
<p>• Verbo HTTP: 'GET'</p>
<p>• Exemplo de Solicitação via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/304135086-785f46a3-3f92-4b74-8e97-f96211def9c5.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240212%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240212T152345Z&X-Amz-Expires=300&X-Amz-Signature=add65d1d237463fff9fa985b1cc3d1ac6337762ccc1c987485a0cf42eb5d2526&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

<p><b>OBS:</b> a requisição pode ser feita tambem diretamente pela url do navegador, através do localhost.</p>
<p>• Exemplo de resposta <b>(Sucesso)</b> via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303430531-3f073db0-fbcc-4fe3-a6c1-9c1b8384fd02.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T174007Z&X-Amz-Expires=300&X-Amz-Signature=8be7c8dabc23a716658b7f3de3bdf2cb7fb0a2888bac2240f43ba8de9430b6ac&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

### 3. Recuperar produtos por <b>{ID}</b>
<p>• URL: /autopecas/{ID}</p>
<p>• Verbo HTTP: 'GET'</p>
<p>• Exemplo de Solicitação via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303433553-8a44ffdd-7b68-4870-8ba2-fd58aa047d74.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T174804Z&X-Amz-Expires=300&X-Amz-Signature=d0a2c5b8691c7b3a087687f6c4f46bc4573e40559fb3b244a57f062ef79dbf7c&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">
<p>• Exemplo de resposta <b>(Sucesso)</b> via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303434069-59ebb299-f19b-4e83-bf0c-d5154f08591c.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T175008Z&X-Amz-Expires=300&X-Amz-Signature=b6356f2ccde9bc54166eda1a2d4e497ca169379e7311ce2b57fd6231ef1c96d4&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

### 4. Atualizar Produto</b>
<p>• URL: /autopecas/{ID}</p>
<p>• Verbo HTTP: 'PUT'</p>
<p>• Exemplo de Solicitação via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/304330154-8e18831d-db46-4f72-a88d-b3d003ecafb7.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240213%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240213T074344Z&X-Amz-Expires=300&X-Amz-Signature=26d7bdb9a746cd2a2cb730bdf8e6cb76e30d2ae3a1c45c1a5a1fd9a3bb740118&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">


<p>• Produto <b>antes de receber a atualização:</b></b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303438425-a990ff2c-f9fa-43fd-bb01-2ad9fa269cbd.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T180621Z&X-Amz-Expires=300&X-Amz-Signature=c96049be27b71202693ef76403993e7d181001020a0cf940bcba8dd7f4b59866&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

<p>• Exemplo de resposta <b>(Sucesso)</b> via <b>postman</b> apos o produto ser <b>atualizado</b>:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/304330557-20e29dc6-e71c-4287-bae2-d4d55fdb3731.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240213%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240213T074511Z&X-Amz-Expires=300&X-Amz-Signature=fee19f1c748286d2585c21c50b08558365faf774074b2751e1fdd045c4d6debe&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">



### 5. Deletar produto</b>
<p>• URL: /autopecas/{ID}</p>
<p>• Verbo HTTP: 'DELETE'</p>
<p>• Exemplo de Solicitação via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303436482-d8ea0de5-775d-4e4b-8717-81cb195bdd65.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T175924Z&X-Amz-Expires=300&X-Amz-Signature=d8a76995e5dabe064d9d8825d94e728228b7ce911e696ba9cc3c589e88fc87bc&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">
<p>• Exemplo de resposta <b>(Sucesso)</b> via <b>postman:</b></p>
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/115328362/303436939-21260c27-3154-4aab-bc04-c3baf2dfa33f.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240208%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240208T180104Z&X-Amz-Expires=300&X-Amz-Signature=85ca076b822bc291e3be502cf9c9444f9d80119b9fcff23071c7c2a9180bcbb1&X-Amz-SignedHeaders=host&actor_id=115328362&key_id=0&repo_id=754712609">

## Códigos de status possíveis

### '200 OK' :
<p>O retorno significa que está tudo bem com sua solicitação, e ela irá ser processada.</p>

### '201 CREATED' :
<p>O retorno significa que está tudo bem com sua solicitação, e que os dados informados serão criados e inseridos ao banco de dados.</p>

### '400 Bad Request': 
<p>Requisição inválida.</p>

### '404 Not Found': 
<p>O retorno significa que o produto que está sendo solicitado não foi encontrado, ou já foi excluido.</p>



