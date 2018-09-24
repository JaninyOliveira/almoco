o    Requisitos de ambiente necessários para compilar e rodar o software
Necessita de JDK 8, Maven e Weblogic ou outro servidor de aplicacao J2EE.

o    Instruções de como utilizar o sistema.

Na tela de login (http://localhost:7001/almoco/login.xhtml) é possível acessar o sistema com 10 logins diferentes e senhas diferentes. 
 São eles:
Login = Usuario1 Senha = Usuario1;
Login = Usuario2 Senha = Usuario2;
Login = Usuario3 Senha = Usuario3;
Login = Usuario4 Senha = Usuario4;
Login = Usuario5 Senha = Usuario5;
Login = Usuario6 Senha = Usuario6;
Login = Usuario7 Senha = Usuario7;
Login = Usuario8 Senha = Usuario8;
Login = Facilitador1 Senha = Facilitador1; 
Login = Facilitador2 Senha = Facilitador2.

Os logins começados com USUARIO permitem apenas votar no restaurante favorito somente uma vez, conforme a Estória 1, escolhendo o restaurante na lista e clicando no botão VOTAR. Assim que o Facilitador1 ou 2 encerrar a votação, caso faça o login novamente, o Usuario será direcionado para a página de resultados, onde pode verificar o Restaurante vencedor do dia, conforme solicitado na Estória 3. Se tentar logar para votar mais de uma vez enquanto a votação ainda estiver aberta, o Usuario será levado para uma página de agradecimento pelo voto. 

Os logins começados com Facilitador visualizam, além do botão VOTAR, o botão PAINEL ADMINISTRATIVO. Esse botão direciona para uma página onde o Facilitador:
- Painel: mostra quantos votos cada restaurante já recebeu;
- Botão "Encerrar Votação": ao clicar, o Facilitador determina que os restaurantes não vão mais receber votos. Assim quem tentar acessar novamente verá apenas o resultado da votação;
- Botão "Iniciar votação do dia": pela manhã de cada dia, o Facilitador deverá clicar para que o restaurante escolhido no dia anterior seja retirado da lista de poss'iveis restaurantes a serem votados naquela semana, conforme Estória 2, para que os usuarios comecem efetivamente a votar no restaurante do dia. 
- Botão "Iniciar votação da semana": na segunda-feira, o Facilitador deve clicar neste botão para que a lista de restaurantes a serem votados receba todos os restaurantes cadastrados anteriormente, já que foram retiradas nas votacoes anteriores.

o    O que vale destacar no código implementado?
- Utilizacao do escopo de aplicacao do JSF para armazenar os objetos em memoria;
- Uso dos componentes do Primefaces;
- Uso do atributo Rendered para exibir o componente JSF de acordo com o nivel de privilegios.

o    O que poderia ser feito para melhorar o sistema?
- O sistema possui uma limitacao onde apenas um usuario pode estar logado por vez.
- Cadastro de restaurantes
- Cadastro de usuarios
- Automatizacao dos processos de fechamento, abertura diaria e semanal de votacao basedo na data corrente e horario;
- Melhorias na interface grafica e navegacao;
- Implementacao da autenticacao do usuario diretamente no servidor;
- Banco de dados :D


