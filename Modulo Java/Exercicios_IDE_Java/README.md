<h1>Dominando IDEs Java </h1>

<p> Sejam bem-vindos ao curso <strong>DOMINANDO IDEs JAVA</strong> oferecido gratuitamente pela plataforma de cursos online <a href="https://web.digitalinnovation.one/"><strong> Digital Innovation One</a></strong>. 🧡💛<br>

<p>
🔹 Começaremos passando rapidamente sobre o Java e algumas das suas características mais importantes <br>
🔹 Em seguida, entraremos nas instalações do Java e das IDEs nos diferentes sistemas operacionais: Windows e Linux<br>
🔹 E seguiremos até o final do curso explicando de uma forma leve e objetiva sobre umas das IDEs mais conhecidas para desenvolvimento Java: Eclipse IDE e IntelliJ IDEA IDE <br>
</p>    
<p align="center"> <em> ⚠️ Lembrando que o <strong>foco do curso são as IDEs</strong> e não a linguaguem Java. Ok? ⚠️ </em></p>



<h2>
🛑 Pré-requistos
</h2>


- [x] Sistema operacional (Windows e/ou Linux)

- [x] Conta no GitHub

  

<h2> 📚 Ementa</h2>

<h3><strong>▪️ Instalação/Configuração do Java</strong></h3>

✅ Um pouco da história do Java<br>✅ Diferença entre JRE e JDK<br>✅ Versões do Java<br>
✅ Se não existisse IDE?<br>

<h3><strong> ▪️ Ubuntu</strong></h3>

✅ Instalação OpenJDK <br>✅ Configuração de variável de ambiente<br>✅ Instalação do Eclipse<br>✅ Configurando o ícone no Dock<br>✅ Instalação do IntelliJ<br>

<h3><strong> ▪️ Windows</strong></h3>

✅ Instalação OpenJDK<br>✅ Configuração de variável de ambiente<br>✅ Instalação do Eclipse<br>✅ Instalação do IntelliJ<br>

<h3><strong> ▪️ IntelliJ </strong></h3>

✅ Diferenças entre versões<br>✅ Conhecendo um pouco por dentro da IDE<br>✅ Criando seu primeiro projeto Java no IntelliJ<br>✅ Atalhos e Produtividade<br>✅ Conectar seu projeto no GitHub<br>

<h3><strong> ▪️ Eclipse </strong></h3>

✅ Diferenças entre versões<br>✅ Conhecendo um pouco por dentro da IDE<br>✅ Criando seu primeiro projeto Java no IntelliJ<br>✅ Atalhos e Produtividade<br>✅ Conectar seu projeto no GitHub<br>

<h3><strong> ▪️ Outras Alternativas </strong></h3>

✅ Visual Studio Code<br>

<br><br>

h2><strong> 🐧 LINUX</h2></strong>

<h3>🔺 Instalação OpenJDK</h3>

<em><strong>O OpenJDK (Kit de Desenvolvimento Java Aberto)</strong> é uma  implementação gratuita e de código aberto da linguagem de programação  Java.  A implementação está licenciada sob a GNU General Public License  (GPL) com uma exceção de vinculação. <strong>JDK = JRE + JVM</strong></em>

🔸 <strong>1.</strong> Abra o terminal e vamos verificar se temos o Java instalado:

```
java -version
```

🔸 <strong>2.</strong> Para instalar o openJDK-11, digite no terminal:
<em>A versão mais atual LTS é do Java 11, que terá seu suporte  estendido até Setembro de 2022. Este tipo de suporte iniciou no Java 8  que será mantido até 2023.</em>

```
sudo apt-get install openjdk-11-jdk
```

🔸 <strong>3.</strong> Confirme se realmente foi instalado com sucesso:

```
java -version
```

🔸<strong>4.</strong> Vamos configurar o ambiente JAVA_HOME:

​	<strong>4.1</strong> Verificar o caminho da instalação do Java:

```
sudo update-alternatives --config java
```

​	<strong>4.2</strong> Copie o caminho que aparecerá no terminal, no meu caso:

```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java
```

​	<strong>4.3</strong> Vamos editar o arquivo .bashrc:

```
sudo gedit ~/.bashrc
```

​	<strong>4.4</strong> Copie o código abaixo e cole no final do arquivo .bashrc. 

​	<em>IMPORTANTE: cuidado para não alterar nada no arquivo além de apenas colar no final do mesmo o que vou te disponibilizar a seguir. </em>

​	<em>JAVA_HOME = aqui você coloca o caminho do tópico 4.2, tirando o /bin/java</em>

```
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME
```

​	<strong>4.3</strong> Salve o arquivo

​	<strong>4.4</strong> Vamos conferir se a alteração ficou salva:

```
cat ~/.bashrc
```

🔸<strong>5.</strong>  Feche o terminal e abra novamente

🔸<strong>6.</strong> Vamos conferir mais uma vez se o Java está instalado na nossa máquina

```
java --version
```

<h3>🔺 Instalação Git </h3>

🔸 <strong>1.</strong> Abra o terminal (Ctrl + Alt + t) e vamos verificar se temos o git instalado:

```
git --version
```

🔸 <strong>2.</strong> Execute o comando:

```
sudo apt-get install git-all
```

🔸<strong>3.</strong> Confirme novamente se o git realmente está instalado:

```
git --version
```

🔸 <strong>4.</strong> Vamos começar as configurações iniciais:

​	<strong>4.1</strong> Cofigurar o nome de usuário

```
git config --global user.name "Seu nome"
```

​	<strong>4.2</strong> Configurar o endereço de e-mail:
​	<em>É de suma importância que o ENDEREÇO DE E-MAIL SEJA O MESMO DO GITHUB afim de evitar conflitos!</em>

```
git config --global user.email seuemail@email.br
```

​	<strong>4.3</strong> Vamos conferir a lista de configurações:

```
git config --list
```

🔸 <strong>5.</strong> Pronto, git instalado e configurado com sucesso!

<br><br>
