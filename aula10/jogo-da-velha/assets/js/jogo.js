var nome1 = '';
var nome2 = '';

var rodada = 1;
var matriz_jogo = Array(3); 

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;

$(document).ready(function () {

    $('#btn_iniciar_jogo').click(function () {
        if ($('#nick_1').val() == '') { 
            $('#nome_1').html('Jogador 1');
            nome1 = 'Jogador 1';
        } else {
            $('#nome_1').html($('#nick_1').val());
            nome1 = $('#nick_1').val();
        }

        if ($('#nick_2').val() == '') {
            $('#nome_2').html('Jogador 2');
            nome2 = 'Jogador 2';
        } else {
            $('#nome_2').html($('#nick_2').val());
            nome2 = $('#nick_2').val();
        }

        $('#pagina_inicial').hide();
        $('#palco_jogo').show();
    });

    $('.jogada').click(function () {
        var id_campo_clicado = this.id;
        $('#' + id_campo_clicado).off();
        jogada(id_campo_clicado);
    });

    function jogada(id) {
        var icone = '';
        var ponto = 0;

        if ((rodada % 2) == 1) {
            icone = 'url("assets/img/marcacao_1.png")';
            ponto = -1;
        } else {
            icone = 'url("assets/img/marcacao_2.png")';
            ponto = 1;
        }

        rodada++;

        $('#' + id).css('background-image', icone);

        var linha_coluna = id.split('-');

        matriz_jogo[linha_coluna[0]][linha_coluna[1]] = ponto;

        verifica_combinacao();
    }

    function verifica_combinacao() {
        //verifica na horizontal linha A
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['a'][i];
        }
        ganhador(pontos);

        //verifica na horizontal linha B
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['b'][i];
        }
        ganhador(pontos);

        //verifica na horizontal linha C
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['c'][i];
        }
        ganhador(pontos);

        //verifica na vertical
        for (var l = 1; l <= 3; l++) {
            pontos = 0;
            pontos = pontos + matriz_jogo['a'][l];
            pontos = pontos + matriz_jogo['b'][l];
            pontos = pontos + matriz_jogo['c'][l];

            ganhador(pontos);
        }

        //verifica na diagonal
        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);

        pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);
    }

    function ganhador(pontos) {
        if (pontos == -3) {
            var jogada_1 = nome1;
            
            $('#ganhador').html(jogada_1 + ' é o vencedor 🎉');
            $('.jogada').off();
        } else if (pontos == 3) {
            var jogada_2 = nome2
           
            $('#ganhador').html(jogada_2 + ' é o vencedor 🎉');
            $('.jogada').off();
        }
    }

});