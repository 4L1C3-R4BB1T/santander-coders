$(document).ready(() => {

    $('#btn-enviar').click(() => {

        var name = $('#name').val();
        var email = $('#email').val();
        var password = $('#password').val();
        var re_password = $('#re_password').val();
        var option = $("#noticias input[type='radio']:checked").val();
        var genero = $('#genero input[type="radio"]:checked').val();

        var regexName = /^[a-z0-9]+$/i;
        var regexMail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;

        // validando o campo 'name'
        if (name == '') {
            alert('O campo Nome é obrigatório!');

            $('#name').css('border-color', 'red');
            $('#name').css('background-color', '#ffe5e5');
            $('#name').focus();

            return false;
        } else if (!(regexName.test(name))) {
            alert('O campo Nome só pode conter letras e números!');

            $('#name').css('border-color', 'red');
            $('#name').css('background-color', '#ffe5e5');
            $('#name').focus();

            return false;
        }

        // validando o campo 'email'
        if (email == '') {
            alert('O campo Email é obrigatório!');

            $('#email').css('border-color', 'red');
            $('#email').css('background-color', '#ffe5e5');
            $('#email').focus();

            return false;
        } else if (!(regexMail.test(email))) {
            alert('Digite um endereço de Email válido!');

            $('#email').css('border-color', 'red');
            $('#email').css('background-color', '#ffe5e5');
            $('#email').focus();

            return false;
        }

        // validando o campo 'senha'
        if (password == '') {
            alert('O campo Senha é obrigatório!');

            $('#password').css('border-color', 'red');
            $('#password').css('background-color', '#ffe5e5');
            $('#password').focus();

            return false;
        }

        // validando o campo 'confirmação de senha'
        if (re_password == '') {
            alert('O campo Confirmação de senha é obrigatório!');

            $('#re_password').css('border-color', 'red');
            $('#re_password').css('background-color', '#ffe5e5');
            $('#re_password').focus();

            return false;
        }

        // verificando se as duas senhas digitadas são iguais
        if (password !== re_password) {
            alert('As senhas digitadas não coincidem!');

            form.re_password.value = '';
            $('#re_password').focus();

            return false;
        }

        // verificando se alguma opção foi selecionada
        if (option == undefined) {
            alert('O campo Deseja receber notícias? é obrigatório!');

            return false;
        }

        // verificando se alguma opção foi selecionada
        if (genero == undefined) {
            alert('O campo Gênero é obrigatório!');

            return false;
        }

        return true;
    });

    // alterando a cor da página
    $('#masculino').click(() => $('body').css('background-color', 'cyan'));
    $('#feminino').click(() => $('body').css('background-color', 'pink'));
    $('#outro').click(() => $('body').css('background-color', 'yellow'));

    // ocultar formulário
    $('#btn-ocultar').click(() => {

        $('#conteudo').hide();
        $('#container-dados').show();

        // inserindo os valores nos spans
        $('#val-nome').html(form.name.value);
        $('#val-email').html(form.email.value);
        $('#val-senha').html(form.password.value);
        $('#val-noticias').html(form.option.value);
        $('#val-genero').html(form.genero.value);

        // editar formulário
        $('#btn-editar').click(() => {

            $('#container-dados').hide();
            $('#container-edicao').show();

            var arrayMudanca = [];
            $('#ed-nome').val(form.name.value);
            $('#ed-nome').change(() => arrayMudanca.push(' Nome'));

            $('#ed-email').val(form.email.value);
            $('#ed-email').change(() => arrayMudanca.push(' Email'));

            $('#ed-senha').val(form.password.value);
            $('#ed-senha').change(() => arrayMudanca.push(' Senha'));

            // confirmar edição
            $('#btn-confirmar').click(() => alert('Deseja mesmo alterar os campos abaixo?\n' + arrayMudanca));

        });

    });

});
