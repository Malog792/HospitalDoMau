# HospitalDoMau
Projeto de A3 da Facul, fizemos uma fila de atendimento funcional para um hospital, de forma complementar a um trabalho passado.

No nosso projeto, buscamos exibir as opções mais necessárias dentro de uma fila de atendimento, onde o indivíduo pode interagir retirando sua senha preferencial ou comum, emergencial ou não, disponibilizando juntamente o acesso com login/cadastro para quem for operar a parte de triagem da fila seja o médico(a) ou funcionário(a).  

   A primeira tela elaborada foi a Tela Principal consiste em apresentar os caminhos que podem ser seguidos como retirar a senha na Tela Senhas ou ir para área médica na Tela Médico. Além de opção de consultar o primeiro lugar das filas disponíveis que totalizam em 4 (Fila Preferencial Emergência, Fila Comum Emergência, Fila Preferencial, Fila Comum). 

   As demais telas também têm opções que te levam à caminhos e/ou interações diferentes, na Tela Senhas por exemplo é possível retirar uma senha de acordo com a necessidade do usuário, onde tem 4 botões correspondentes às respectivas filas. Deste modo uma vez que retirada, essa senha é registrada naquela respectiva fila e é exibida para o usuário correspondente, em seguida o próprio é redirecionado para a Tela Principal.  

    Já na Tela Médico é necessário que o usuário preencha o login de forma correta, onde há dois campos (usuário e senha), uma vez que ele digita as palavras já predefinidas ele conclui o login e segue para a Tela Triagem. Na Tela Triagem são disponíveis novamente 4 botões correspondentes às filas apresentadas, e nela é possível o responsável chamar as pessoas pelas senhas, onde a primeira da fila é chamada para atendimento. A lógica de chamada do responsável seguirá a ordem predefinida (Preferencial Emergência => Comum Emergência => Preferencial => Comum). 

    Todas as ações com os botões são exibidas janelas interativas para confirmar as próprias ações e transições de telas, também para confirmar ou não o fechamento do programa/processo. Importante ressaltar que uma vez que o sistema for encerrado, as senhas registradas são “limpadas”, ou seja apagadas do arquivo  
