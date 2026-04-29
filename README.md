# 💰 Sistema Bancário em Java

Este projeto é uma implementação simples de um sistema bancário utilizando **Programação Orientada a Objetos (POO)** em Java.

## 📌 Objetivo

Simular operações básicas de um banco, como:

- Criação de contas
- Depósitos
- Saques
- Transferências
- Impressão de extratos

---

## 🧱 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 🏦 `Banco.java`

Responsável por representar a entidade Banco.

```java
public class Banco {
    private String nome;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
```

---

### 👤 `Cliente.java`

Representa um cliente do banco.

```java
public class Cliente {
    private String nome;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
```

---

### 💳 `Conta.java`

Classe abstrata que define o comportamento básico de uma conta bancária.

#### Funcionalidades:

- Saque
- Depósito
- Transferência
- Controle de saldo
- Agência e número automático

```java
public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
```

---

### 💼 `ContaCorrente.java`

Representa uma conta corrente.

```java
public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
```

---

### 💰 `ContaPoupanca.java`

Representa uma conta poupança.

```java
public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
```

---

## 🔄 Funcionalidades Implementadas

✔ Criar contas automaticamente  
✔ Depósito de valores  
✔ Saque de valores  
✔ Transferência entre contas  
✔ Impressão de extrato  

---

## ⚠️ Melhorias Futuras

- Implementar validações (saldo insuficiente, valores negativos)
- Criar interface `Iconta` (caso ainda não exista no projeto)
- Adicionar autenticação de cliente
- Interface gráfica ou API REST
- Persistência de dados (Banco de Dados)


Este projeto é de uso educacional.
