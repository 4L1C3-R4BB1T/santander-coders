function dizerOla() {
    alert('Olá!');
}

function alterarFundo() {
    document.body.style.backgroundColor = 'green';
}

function verImagem() {
    console.log('Estou vendo a imagem.');
}

document.getElementById('image').addEventListener('click', (event) => {
    console.log('Estou clicando na imagem.');
    console.log('Posição X: ' + event.clientX);
    console.log('Posição Y: ' + event.clientY);
});


// document.body.addEventListener('click', mudarFundo);

// function mudarFundo() {
//     this.style.backgroundColor = 'red';
// }

// setTimeout(() => alert('Tempo esgotado!'), 10000);

// setInterval(() => alert('Hora do intervalo!'), 5000);
