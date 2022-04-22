
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
// Abaixo segue um exemplo de código que você pode ou não utilizar

let totalDeDias = parseInt(gets());

let qtdAnos, qtdMeses;

qtdAnos = parseInt(totalDeDias / 365);
totalDeDias= totalDeDias % 365; 

qtdMeses= parseInt(totalDeDias / 30);
totalDeDias= totalDeDias % 30;                     ;

let resultado = (qtdAnos + " ano(s) " + '\n' + 
qtdMeses +" mes(es)" + '\n' +
totalDeDias + " dia(s)");

print(resultado)

/* -----------------------------------------------------------------------

A lógica fica por conta de descobrir a quantidade de anos, meses e dias.

No enunciado ele vai considerar que todos os anos tem 365 dias e todos os meses tem 30 dias.

Para descobrir a quantidade de anos divida o total de dias por 365 (total de dias / 365)

Para descobrir a quantidade de meses obtenha o resto da divisão do total de dias por 365 e depois divida por 30

(total de dias % 365) / 30

Para descobrir a quantidade de dias restantes obtenha o resto da divisão do total de dias por 365 e depois obtenha o resto da divisão antes mencionada pelo resto da divisão do total de dias de um mês que é 30

(total de dias % 365) % 30


Ponto importante conforme é no JS então sempre converta o resultado dessas operações para inteiro, a função para isso é parseInt();
 */