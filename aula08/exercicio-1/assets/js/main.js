function ocultarCabecalho() {
    document.getElementById('cabecalho').style.display = 'none';
    document.getElementById('image').style.filter = 'grayscale(100%)';
}

var vermelhos = document.querySelectorAll('.vermelho');

for (var i = 0; i < vermelhos.length; i++) {
    vermelhos[i].style.background = 'pink';
}

console.log(document.getElementById('copyright').attributes);

console.log(document.getElementById('twitter').getAttribute('href'));
console.log(document.getElementById('facebook').getAttribute('href'));

document.getElementById('youtube').setAttribute('href', 'https://www.youtube.com/channel/UCRQdwmWMhTcqDFjPT4UPZYA');
console.log(document.getElementById('formulario').hasAttribute('action'));
document.getElementById('formulario').removeAttribute('href')
document.getElementById('formulario').setAttribute('action', 'https://www.google.com');

// console.log(document.getElementById('formulario').hasAttribute('action'));

document.getElementById('titulo').style.color = 'red';

var icons = document.querySelectorAll('.icon');

for (var i = 0; i < icons.length; i++) {
    icons[i].style.filter = 'invert(100%)';
}

document.getElementById('op1').textContent = 'Início';
document.getElementById('op2').textContent = 'Sobre';
document.getElementById('op3').textContent = 'Serviços';
document.getElementById('op4').textContent = 'Contato';

var lista = document.getElementById('social');
var elementoFilho = lista.children.item(3);
lista.removeChild(elementoFilho);





