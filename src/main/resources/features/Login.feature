# language: pt

  Funcionalidade: Login
    Eu como usuario do sistema quero logar para realizar
    manutencao no cadastro de funcionarios

  Cenario: Deve realizar login com sucesso
    Dado que eu tenha acesso ao sistema
    Quando informar meu usuario "Victorrosa"
    E informar minha senha "rosa"
    E clicar no botao entre
    Entao deve abrir a pagina de cadastro de funcionarios