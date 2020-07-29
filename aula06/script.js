var valNumIntPos = 20;
var valNumIntNeg = -10;
var valNumDec =  5.4;
var valString = "Sou uma string!"
var valTrue = true;

console.log(valNumIntPos);
console.log(valNumIntNeg);
console.log(valNumDec);
console.log(valString);
console.log(valTrue);


var nome = "João";
var sobrenome ="Silva";

console.log(nome + " " + sobrenome);

console.log(nome, sobrenome);


console.log("Phasellus eget odio ut tortor rutrum elementum. \n Maecenas vitae orci sit amet nunc consectetur tempus. \n Vivamus quis iaculis purus, rutrum feugiat enim. \n Aliquam quis ultrices tellus. \n Morbi a ipsum quam.");


var valorNulo = null;
var naoDefinido = undefined;

console.log(valorNulo);
console.log(naoDefinido);


var listaFrutas = ['laranja', 'pera', 'uva', 'morango', 'manga'];

console.log(listaFrutas);


var texto = "Digital House, a escola de programação que forma novas gerações de coders \n e profissionais digitais para imaginar, inovar e criar o que sempre sonharam.";

console.log(texto);


//switch case
var mes = 1;

switch(mes){
    case 1: console.log('Janeiro');
        break;
    case 2: console.log('Fevereiro');
        break;
    case 3: console.log('Março');
        break;
    case 4: console.log('Abril');
        break;
    default: console.log('Mês não existe');
}


//while
var numero = 0;

while(numero < 3){
    console.log('Olá' + numero);
    numero++;
}


//do while
var numero = 0;

do{
    console.log('Olá' + numero);
    numero++;
}while(numero < 3)


//for
var numero = 0;

for(var numero = 0; numero < 3; numero++){
    console.log('Olá' + numero);
}


//leitura de array
var lista = [10, 20, 30];

for(var i in lista){
    console.log(lista[i]);
}


//leitura de objeto
var nome = { nome: 'joao', sobrenome: 'silva'};

for(var n in nome){
    console.log(n);
    console.log(nome[n]);
    //console.log(n + ": " + nome[n]);
}
