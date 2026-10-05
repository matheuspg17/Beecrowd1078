# Resolução exercício Beecrowd1078

## Descrição do problema
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

## Como Funciona
1. O usuário insere o número inteiro desejado, que é armazenado na variável `num`.
2. Uma estrutura de repetição `for` inicia no multiplicador 1 (`i = 1`) e avança sequencialmente até 10 (`i <= 10`).
3. Dentro do laço, o programa calcula o produto da multiplicação atual: `resultado = i * num`.
4. A linha resultante é impressa de forma formatada concatenando os valores textuais: `i + " x " + num + " = " + resultado`.