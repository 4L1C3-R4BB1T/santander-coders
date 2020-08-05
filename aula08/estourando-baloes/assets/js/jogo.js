// variável que armazena a chamada da função timeout
var timerId = null;

function iniciaJogo() {
	var url = window.location.search;
	var nivel_jogo = url.replace("?", "");
	var tempo_segundos = 0;

	switch (nivel_jogo) {
		case '1':
			tempo_segundos = 20;
			var qtd_baloes = 10;
			break;
		case '2':
			tempo_segundos = 30;
			var qtd_baloes = 30;
			break;
		case '3':
			tempo_segundos = 40;
			var qtd_baloes = 60;
			break;
		case '4':
			tempo_segundos = 40;
			var qtd_baloes = 80;
			break;
		default:
	}

	// inserindo segundos no span
	document.getElementById('cronometro').innerHTML = tempo_segundos;

	criar_baloes(qtd_baloes);

	// imprimir qtde baloes inteiros
	document.getElementById('baloes_inteiros').innerHTML = qtd_baloes;
	document.getElementById('baloes_estourados').innerHTML = 0;

	contagem_tempo(tempo_segundos + 1);
}

function contagem_tempo(segundos) {
	segundos = segundos - 1;

	if (segundos == -1) {
		// para a execução da função do settimeout
		clearTimeout(timerId);
		game_over();
		return false;
	}

	document.getElementById('cronometro').innerHTML = segundos;

	timerId = setTimeout("contagem_tempo(" + segundos + ")", 1000);
}

function game_over() {
	remove_eventos_baloes();
	alert('Fim de jogo, você não conseguiu estourar todos os balões a tempo!');
}

function criar_baloes(qtd_baloes) {
	for (var i = 1; i <= qtd_baloes; i++) {
		var balao = document.createElement("img");

		balao.src = 'assets/img/balao_azul_pequeno.png';
		balao.style.margin = '10px';
		balao.id = 'b' + i;
		balao.onclick = function () { estourar(this); };

		document.getElementById('cenario').appendChild(balao);
	}
}

function estourar(e) {
	var id_balao = e.id;

	document.getElementById(id_balao).setAttribute("onclick", "");
	document.getElementById(id_balao).src = 'assets/img/balao_azul_pequeno_estourado.png';

	pontuacao(-1);
}

function remove_eventos_baloes() {
	// contador para recuperar balões por id
	var i = 1;

	// percorre os elementos de acordo com o id e só irá sair do laço 
	// quando não houver correspondência com elemento
	while (document.getElementById('b' + i)) {
		//retira o evento onclick do elemnto
		document.getElementById('b' + i).onclick = '';
		i++;
	}
}

function pontuacao(acao) {
	var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;
	var baloes_estourados = document.getElementById('baloes_estourados').innerHTML;

	baloes_inteiros = parseInt(baloes_inteiros);
	baloes_estourados = parseInt(baloes_estourados);

	baloes_inteiros = baloes_inteiros + acao;
	baloes_estourados = baloes_estourados - acao;

	document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;
	document.getElementById('baloes_estourados').innerHTML = baloes_estourados;

	situacao_jogo(baloes_inteiros);
}

function situacao_jogo(baloes_inteiros) {
	if (baloes_inteiros == 0) {
		alert('Parabéns, você conseguiu estourar todos os balões a tempo!');
		parar_jogo();
	}
}

function parar_jogo() {
	clearTimeout(timerId);
}