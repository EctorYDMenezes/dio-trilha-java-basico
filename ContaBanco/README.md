# 💰 ContaBanco - Desafio Java Básico | DIO

Este projeto foi desenvolvido como parte do desafio da **Digital Innovation One (DIO)**, na trilha **Java Básico**. O foco deste desafio foi treinar a **entrada de dados via terminal** utilizando a linguagem **Java**, além de reforçar a prática da **sintaxe básica** da linguagem.

## 📋 Descrição do Desafio

O programa simula a abertura de uma conta bancária, onde o usuário insere suas informações pessoais e recebe uma mensagem formatada confirmando a criação da conta e o saldo disponível.

### 💡 O que foi praticado:
- Importação e uso da classe `Scanner` para entrada de dados;
- Uso de variáveis (`int`, `String`, `double`);
- Exibição formatada com `System.out.printf`;
- Configuração de localidade com `Locale.setDefault(Locale.US)` para leitura de ponto flutuante com `.`.

## 📂 Estrutura do Código

```java
//Incialização da biblioteca Scanner, para assim pser feita a inserção dos valores via terminal
        Scanner scanner = new Scanner(System.in);
        
        //Importação  necessária para a leitura de '.' como separador da casa decimal como proposta no desafio!
        Locale.setDefault(Locale.US);

        System.out.println("Bom dia, vamos seguir com o seu cadastro no banco DIO, por favor sigas os passos seguintes: ");
        
        //Inserir o valor do ID
        System.out.println("Informe o seu número de acesso: ");
        var numero = scanner.nextInt();
        
        //Inserir o número da agência
        System.out.println("Informe o número da sua agência: ");
        var agencia = scanner.next();
        scanner.nextLine();
        
        //Inserir o nome
        System.out.println("Informe o seu nome: ");
        var nomeCliente = scanner.nextLine();
        
        //Inserir o valor do saldo dsiponível
        System.out.println("Informe o saldo disponível em R$: ");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
```

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/EctorYDMenezes/dio-trilha-java-basico.git

```

2. **Compile o código:**

```bash
javac ContaTerminal.java
```

3. **Execute no terminal:**

```bash
java ContaTerminal
```

## 🖼️ Exemplo de Uso

```
Bom dia, vamos seguir com o seu cadastro no banco DIO, por favor sigas os passos seguintes:
Informe o seu número de acesso:
1234
Informe o número da sua agência:
0001
Informe o seu nome:
Ector Yuri
Informe o saldo disponível em R$:
2500.75

Olá Ector Yuri, obrigado por criar uma conta em nosso banco, sua agência é 0001, conta 1234 e seu saldo de R$2500.75 já está disponível para saque
```

## 🧑‍💻 Autor

Desenvolvido por [Ector Yuri Duarte Menezes](https://github.com/EctorYDMenezes) como parte dos estudos em Java na plataforma [DIO](https://www.dio.me/).
