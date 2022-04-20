// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar
// Desafio 2 / 3 - Quadrado e ao Cubo


// let linhas = parseInt(gets());

// //TODO: Complete os espaços em branco com uma solução possível para o problema.

// let limit = parseInt(gets());

// for (let i = 1; i <= limit; i++) {
//   let X =(      );
//   let Y = (     );

//   print(      );
// }


//Resolução
let linhas = parseInt(gets());

//TODO: Complete os espaços em branco com uma solução possível para o problema.

let limit = parseInt(linhas);

for (let i = 1; i <= limit; i++) {
  let X =( i * i );           //elevado ao quadrado
  let Y = ( Math.pow(i, 3)); //elevado ao cubo

  print(i + " " + X + " " + Y);
}