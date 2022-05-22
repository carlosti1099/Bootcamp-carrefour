Dominando IDEs Java

Sejam bem-vindos ao curso DOMINANDO IDEs JAVA oferecido gratuitamente pela plataforma de cursos online Digital Innovation One. orange_heartyellow_heart

small_blue_diamond Começaremos passando rapidamente sobre o Java e algumas das suas características mais importantes
small_blue_diamond Em seguida, entraremos nas instalações do Java e das IDEs nos diferentes sistemas operacionais: Windows e Linux
small_blue_diamond E seguiremos até o final do curso explicando de uma forma leve e objetiva sobre umas das IDEs mais conhecidas para desenvolvimento Java: Eclipse IDE e IntelliJ IDEA IDE

warning Lembrando que o foco do curso são as IDEs e não a linguaguem Java. Ok? warning
stop_sign Pré-requistos

    Sistema operacional (Windows e/ou Linux)

    Conta no GitHub

books Ementa
black_small_square Instalação/Configuração do Java

white_check_mark Um pouco da história do Java
white_check_mark Diferença entre JRE e JDK
white_check_mark Versões do Java
white_check_mark Se não existisse IDE?
black_small_square Ubuntu

white_check_mark Instalação OpenJDK
white_check_mark Configuração de variável de ambiente
white_check_mark Instalação do Eclipse
white_check_mark Configurando o ícone no Dock
white_check_mark Instalação do IntelliJ
black_small_square Windows

white_check_mark Instalação OpenJDK
white_check_mark Configuração de variável de ambiente
white_check_mark Instalação do Eclipse
white_check_mark Instalação do IntelliJ
black_small_square IntelliJ

white_check_mark Diferenças entre versões
white_check_mark Conhecendo um pouco por dentro da IDE
white_check_mark Criando seu primeiro projeto Java no IntelliJ
white_check_mark Atalhos e Produtividade
white_check_mark Conectar seu projeto no GitHub
black_small_square Eclipse

white_check_mark Diferenças entre versões
white_check_mark Conhecendo um pouco por dentro da IDE
white_check_mark Criando seu primeiro projeto Java no IntelliJ
white_check_mark Atalhos e Produtividade
white_check_mark Conectar seu projeto no GitHub
black_small_square Outras Alternativas

white_check_mark Visual Studio Code



h2> penguin LINUX
small_red_triangle Instalação OpenJDK

O OpenJDK (Kit de Desenvolvimento Java Aberto) é uma implementação gratuita e de código aberto da linguagem de programação Java. A implementação está licenciada sob a GNU General Public License (GPL) com uma exceção de vinculação. JDK = JRE + JVM

small_orange_diamond 1. Abra o terminal e vamos verificar se temos o Java instalado:

java -version

small_orange_diamond 2. Para instalar o openJDK-11, digite no terminal: A versão mais atual LTS é do Java 11, que terá seu suporte estendido até Setembro de 2022. Este tipo de suporte iniciou no Java 8 que será mantido até 2023.

sudo apt-get install openjdk-11-jdk

small_orange_diamond 3. Confirme se realmente foi instalado com sucesso:

java -version

small_orange_diamond4. Vamos configurar o ambiente JAVA_HOME:

​ 4.1 Verificar o caminho da instalação do Java:

sudo update-alternatives --config java

​ 4.2 Copie o caminho que aparecerá no terminal, no meu caso:

/usr/lib/jvm/java-11-openjdk-amd64/bin/java

​ 4.3 Vamos editar o arquivo .bashrc:

sudo gedit ~/.bashrc

​ 4.4 Copie o código abaixo e cole no final do arquivo .bashrc.

​ IMPORTANTE: cuidado para não alterar nada no arquivo além de apenas colar no final do mesmo o que vou te disponibilizar a seguir.

​ JAVA_HOME = aqui você coloca o caminho do tópico 4.2, tirando o /bin/java

JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME

​ 4.3 Salve o arquivo

​ 4.4 Vamos conferir se a alteração ficou salva:

cat ~/.bashrc

small_orange_diamond5. Feche o terminal e abra novamente

small_orange_diamond6. Vamos conferir mais uma vez se o Java está instalado na nossa máquina

java --version

small_red_triangle Instalação Git

small_orange_diamond 1. Abra o terminal (Ctrl + Alt + t) e vamos verificar se temos o git instalado:

git --version

small_orange_diamond 2. Execute o comando:

sudo apt-get install git-all

small_orange_diamond3. Confirme novamente se o git realmente está instalado:

git --version

small_orange_diamond 4. Vamos começar as configurações iniciais:

​ 4.1 Cofigurar o nome de usuário

git config --global user.name "Seu nome"

​ 4.2 Configurar o endereço de e-mail: ​ É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!

git config --global user.email seuemail@email.br

​ 4.3 Vamos conferir a lista de configurações:

git config --list

small_orange_diamond 5. Pronto, git instalado e configurado com sucesso!
