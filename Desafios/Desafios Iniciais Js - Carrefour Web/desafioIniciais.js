// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar

//Calcule o quociente e o resto da divisão de dois números inteiros
//Em uma divisão, o quociente é o valor que se obtém ao dividir o dividendo pelo divisor.

let line = gets().split(" ");
const a = parseInt(line[0]);
const b = parseInt(line[1]);

q = parseInt(a / b);

r = (a - b) * q;

if (r < 0) {
  r += Math.abs(b);
  
  q = (a-r) / b;    //escreva sua lógica aqui
}

print(q + " " + r);