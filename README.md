<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=FF0000&height=150&section=header&text=🎮+Sudoku+Game+Java+☕&fontSize=25&fontColor=ffffff&animation=twinkling&fontAlignY=35"/>
 
  [![Typing SVG](https://readme-typing-svg.herokuapp.com/?color=FF0000&size=35&center=true&vCenter=true&width=1000&lines=👀View+🖥️Model+🕹️Controller+🧪Tests+🎮GameOver+☠️🎮🕹)](https://git.io/typing-svg)<br>

  
  <img src="https://github.com/LiliBR-tech/sudoku/blob/main/assets/Java-Logo.png" 
   alt="db3c90cd-1ead-4209-82fd-bb60b9b8e58d" min-width="100px" max-width="100px" width="100px" 
   align="right"> <br>

# 📌 Descrição Sudoku Game - Projeto

🎲 Este é um projeto de um jogo de Sudoku em Java, com diferentes modos de jogo, incluindo o **Modo Gráfico** e o **Modo Console**. O projeto foi desenvolvido de forma modular, com classes dedicadas a cada parte do jogo, como a lógica do tabuleiro, validação de movimentos e interface com o usuário.<br>

# 🛠️ Tecnologias
- Java 11 ou superior.
- IDE de sua preferência (como IntelliJ IDEA, Eclipse ou NetBeans).
- Maven ou Gradle para gerenciamento de dependências (se necessário).<br>

# 🎮 Funcionalidade

🚀 O jogo permite que o usuário jogue uma versão de Sudoku, onde o objetivo é preencher uma grade de 9x9 com números de 1 a 9, de modo que cada número apareça uma vez por linha, coluna e região 3x3.<br>

### ⌨ Modos de Jogo
- **Modo Gráfico**: Interface gráfica onde o jogador interage com o tabuleiro.
- **Modo Console**: Versão simples do jogo no terminal, onde o jogador insere valores no tabuleiro via linha de comando.
- **Modo Avançado**: Modo em desenvolvimento com novas funcionalidades e desafios.<br>

# 📂 Estrutura do Projeto

📌 Este projeto segue uma organização clara e modular para facilitar a manutenção e escalabilidade.

| **Arquivo/Pasta**                                 | **Descrição**                                      |
|---------------------------------------------------|----------------------------------------------------|
| 📂 **.github/workflows/**                         | 📁 Contém automações do GitHub Actions             |
| ├── `java.yml`                                    | 🔧 Configuração do GitHub Actions para CI/CD       |
| 📂 **src/main/java/br/com/sudoku/view**          | 🎨 Interface gráfica do Sudoku (JavaFX)            |
| ├── `GameUI.java`                                 | 🖥️Gerencia a interface gráfica (botões e interações visuais)  |
| ├── `GraphicalMode.java`                          | ▶️ Inicia o jogo no modo gráfico usando JavaFX.            |
| ├── `ConsoleMode.java`                            | ▶️ Inicia o jogo no modono modo console (saída de texto)     |
| 📂 **src/main/java/br/com/sudoku/model/**         | 📁 Lógica e regras do jogo Sudoku                  |
| ├── `Board.java`                                  | 🔢 Representação do tabuleiro do Sudoku            |
| ├── `Game.java`                                   | 🧮 Gerencia as regras do jogo, como validações e progresso|
| ├── `Player.java`                                 | 🎰 Armazena informações do jogador (nome, pontuação, etc.) |
| ├── `Sudoku.java`                                 | 🧠 Implementa a lógica principal do jogo  |
| ├── `ValidadorSudoku.java`                        | ✅ Valida as jogadas para garantir que sejam permitidas            |
| 📂 **src/main/java/br/com/sudoku/controller/**    | 📁 Controlador que gerencia interações             |
| ├── `Main.java`                                    | 🎮 Lida com a lógica entre modelo e visão          |
| ├── `GraphicalMode.java (parcialmente)`            | 🔌 Conecta GameUI com Game          |
| ├── `ConsoleMode.java (parcialmente) `             | 🔌 Conecta o console com Game e Player         |
| 📂 **Classes Auxiliares**                          | ☎ Suporte e funcionalidades adicionais              |
| ├── `ErrorHighlighter.java `                       | ❌ Destaca erros no tabuleiro         |
| ├── `ScoreboardTest.java `                         | 𝟏𝟐𝟑𝟒𝟓𝟔𝟕𝟖𝟗 Gerencia pontuações         |
| 📂 **src/main/java/br/com/sudoku/**               | 📁 Código-fonte principal do jogo                  |
| ├── `Main.java`                                   | 🚀 Ponto de entrada para iniciar o jogo            |
| 📂 **src/main/resources/**                        | 📁 Contém arquivos de configuração ou assets       |
| ├── `styles.css`                                  | 🎨 Estilização do jogo (JavaFX)                    |
| 📂 **src/test/java/br/com/sudoku/**               | 📁 Testes unitários do sistema                     |
| ├── `TabuleiroTest.java`                          | 🧪 Testes para a classe `Tabuleiro`                |
| ├── `SudokuTest.java`                             | 🧪 Testes para a interface gráfica                 |
| ├── `BoardTest.java`                              | 🧪 Testes lógicos                                  | 
| ├── `ConsoleModeTest.java`                        | 🧪 Testes de controle                              |   
| ├── `ErrorHighlighterTest.java`                   | 🧪 Testes  automatizados                           |        
| ├── `GraphicalModeTest.java`                      | 🧪 Testes para a interface gráfica                 |         
| ├── `PlayerTest.java`                             | 🧪 Testes automatizados                            |           
| ├── `ScoreboardTest.java`                         | 🧪 Testes automatizados                            |
| ├── `SudokuTest.java`                             | 🧪 Testes automatizados                            |
| ├── `ValidatorTest.java`                          | 🧪 Testes lógicos                                  |
| ├── `GameUI.java`                                 | 🧪 Testes para a interface gráfica                 |
| ├── `Game.java`                                   | 🧪 Testes lógicos                                  |
| ├── `Main.java`                                   | 🧪 Testes de controle          |
| `.gitignore`                                      | 🗑️ Arquivo para ignorar arquivos desnecessários    |
| `LICENSE`                                         | 📜 Licença do projeto                              |
| `README.md`                                       | 📚 Documentação detalhada do projeto               |

# 🎯 Como Executar o Projeto
1. Clone o repositório
2. Compile com `javac --module-path $HOME/javafx/lib --add-modules javafx.controls,javafx.fxml -d out $(find src -name "*.java")`
3. Execute `java --module-path $HOME/javafx/lib --add-modules javafx.controls,javafx.fxml -cp out br.com.sudoku.Main`<br>

💦 Divirta-se! 🎉<br>

# 💡 Dicas: 
🚀 </> Se precisar personalizar algo no projeto ou melhorar a documentação, fique à vontade! 😃

# 👨‍💻 Autor

<p>
    <img 
      align=left 
      margin=10 
      width=80 
      src="https://avatars.githubusercontent.com/u/186736248?v=4"
    />
    <p>&nbsp&nbsp&nbspLilianBR<br>
    &nbsp&nbsp&nbsp
    <a 
        href="https://github.com/LiliBR-tech">
        GitHub
    </a>
    &nbsp;|&nbsp;
    <a 
        href="https://www.linkedin.com/">
        LinkedIn
    </a>
    &nbsp;|&nbsp;
    <a 
        href="https://www.instagram.com/">
        Instagram
    </a>
    &nbsp;|&nbsp;</p>
</p>
<br/><br/>
<p>
