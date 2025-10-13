Simulador de Caixa Eletrônico

Este é um projeto de um simulador de caixa eletrônico, desenvolvido em Java puro, sem o uso de ferramentas de gerenciamento de dependências como Maven ou Gradle.

 Requisitos

 Para executar este projeto em sua máquina, você precisa ter:

 Java JDK 17 ou superior instalado

 Baixe em: https://adoptium.net
ou https://www.oracle.com/java/technologies/javase-downloads.html

 (Opcional) Um editor ou IDE para Java, como:

 IntelliJ IDEA

 Eclipse

 VS Code com a extensão "Java Extension Pack"

 Git instalado (opcional, para clonar o repositório)

Como rodar o projeto
1. Clonar o repositório

Se você tem o Git instalado, abra o terminal e execute:

git clone https://github.com/henrygss/SimuladorCaixaEletronico.git
cd SimuladorCaixaEletronico


Se preferir, você pode baixar o projeto manualmente:

Acesse: https://github.com/henrygss/SimuladorCaixaEletronico

Clique em "Code" > "Download ZIP"

Extraia o ZIP em uma pasta local

2. Compilar o projeto

Abra o terminal dentro da pasta raiz do projeto e execute o seguinte comando para compilar os arquivos:

javac App/CaixaEletronico.java Model/*.java Service/*.java


Este comando compila a classe principal (CaixaEletronico.java) e todas as classes auxiliares localizadas nas pastas Model e Service.

3. Executar o programa

Após compilar, execute o programa com:

java App.CaixaEletronico


O programa será iniciado no terminal.

Estrutura do Projeto
SimuladorCaixaEletronico/
├── App/
│   └── CaixaEletronico.java      (classe principal com o método main)
├── Model/
│   └── ...                       (classes de modelo)
├── Service/
│   └── ...                       (classes de serviço)

Executando em uma IDE (opcional)

Se preferir utilizar uma IDE:

Abra a pasta do projeto na sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code, etc).

Localize o arquivo CaixaEletronico.java dentro da pasta App.

Execute a classe CaixaEletronico (ela contém o método main).

Autor:

Henry G.
https://github.com/henrygss