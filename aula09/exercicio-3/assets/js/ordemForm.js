var ordem = [];

// gerenciando o campo Name
$('#name').focus(() => ordem.push('Estabelecer o foco no campo Name'));
$('#name').change(() => ordem.push('Inserir dados no campo Name'));
$('#name').blur(() => ordem.push('Perdemos o foco do campo Name'));

// gerenciando o campo Email
$('#email').focus(() => ordem.push('Estabelecer o foco no campo Email'));
$('#email').change(() => ordem.push('Inserir dados no campo Email'));
$('#email').blur(() => ordem.push('Perdemos o foco do campo Email'));

// gerenciando o campo Senha
$('#password').focus(() => ordem.push('Estabelecer o foco no campo Senha'));
$('#password').change(() => ordem.push('Inserir dados no campo Senha'));
$('#password').blur(() => ordem.push('Perdemos o foco do campo Senha'));

// gerenciando o campo Confirmação de senha
$('#re_password').focus(() => ordem.push('Estabelecer o foco no campo Confirme sua senha'));
$('#re_password').change(() => ordem.push('Inserir dados no campo Confirme sua senha'));
$('#re_password').blur(() => ordem.push('Perdemos o foco do campo Confirme sua senha'));

// gerenciando o campo Deseja receber notícias?
$('#op-yes').change(() => ordem.push('Alterando a opção no campo Notícias para Sim'));
$('#op-no').change(() => ordem.push('Alterando a opção no campo Notícias para Não'));

// gerenciando o campo Gênero
$('#masculino').change(() => ordem.push('Alterando a opção no campo Gênero para Masculino'));
$('#feminino').change(() => ordem.push('Alterando a opção no campo Gênero para Feminino'));
$('#outro').change(() => ordem.push('Alterando a opção no campo Gênero para Outro'));

// imprimir o array no console
$('#imprimir').click(() => console.log(ordem));

