// verifica se é par ou ímpar
function parOuImpar(n) {
    if (n % 2 == 0) {
        return "O número " + n + " é par!";
    }
    return "O número " + n + " é ímpar!";
}

// console.log(parOuImpar(5)); 
// console.log(parOuImpar(10)); 



// arrow function que verifica se é número primo
// caso 'n' possua um divisor qualquer ou seja = 1 já deixa de ser primo
// function name () {} 
// () => {}

var ehPrimo = (n) => {
    for (var i = 2; i < n; i++) {
        if (n % i == 0) {
            return (n + " é primo? " + false);
        }
    }
    return (n + " é primo? " + (n != 1));
}

// console.log(ehPrimo(1)); // não é primo
// console.log(ehPrimo(2)); // é primo
// console.log(ehPrimo(3)); // é primo
// console.log(ehPrimo(5)); // é primo
// console.log(ehPrimo(20)); // não é primo
// console.log(ehPrimo(31)); // é primo
// console.log(ehPrimo(17)); // é primo



// imprime de 10 até 1 e depois imprime "feliz ano novo"
function mensagem() {
    console.log("Feliz ano novo!");
}

function contador(callback) {
    for (var i = 10; i > 0; i--) {
        console.log(i);
    }

    setTimeout(() => callback(), 4000);
}

// contador(mensagem);



// Promise
var promise1 = new Promise((resolve, reject) => {
    for (var i = 10; i > 0; i--) {
        resolve(console.log(i));
    }
});

var promise2 = new Promise((resolve, reject) => {
    setTimeout(() => { resolve("Feliz ano novo!") }, 4000);
});

// promise1.then(function (resultado) { return resultado }) 
//     .then(function () { return promise2 })
//     .then(function (resultado) { return console.log(resultado) });



// Async/Await
async function funcaoAsyncAwait() {
    await promise1;
    var secondPart = await promise2;

    console.log(secondPart);
}

// funcaoAsyncAwait();



// imprimindo notas > 7
var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

function notaMaiorQueSete(notas) {
    console.log(notas.filter((n) => n > 7));
} 

// notaMaiorQueSete(notas);



// somar todos os valores 
var produtos = [ 
    { nome: "laranja", preco: 2.50 },
    { nome: "maçã", preco: 3.42 },
    { nome: "pera", preco: 5.67 },
    { nome: "uva", preco: 2.34 },
    { nome: "abacaxi", preco: 4.57 },
    { nome: "morango", preco: 3.78 }
];

function somarPrecos(produtos) {
    return produtos.reduce((total, valor) => total + valor.preco, 0);
}

// console.log(somarPrecos(produtos));



//atribuir disciplina 
var alunos = [ 
    { nome: "Amanda", serie: 8 },
    { nome: "Pedro", serie: 9 },
    { nome: "João", serie: 9 },
    { nome: "Vanessa", serie: 9 },
    { nome: "Patrícia", serie: 8 },
    { nome: "Robson", serie: 8 },
    { nome: "Carlos", serie: 9 },
    { nome: "Diana", serie: 8 },
    { nome: "Leonardo", serie: 9 },
    { nome: "Bianca", serie: 9 }
];

function atribuirDisciplina(alunos) {
    for (var i in alunos) {
        if (alunos[i].serie == 8) {
            alunos[i].disciplina = "História";
        } else {
            alunos[i].disciplina = "Física";
        }
    }
}

// atribuirDisciplina(alunos);
// console.log(alunos);


