function validarDados() {
    var name = form.name.value;
    var email = form.email.value;
    var password = form.password.value;
    var re_password = form.re_password.value;

    // alert("Nome: " + name + "\nEmail: " + email + "\nSenha: " + password + "\nConfirmação de senha: " + re_password);
    // console.log("Nome: " + name + "\nEmail: " + email + "\nSenha: " + password + "\nConfirmação de senha: " + re_password);

    if (name == '') {
        alert('O campo Nome é obrigatório!');
       
        form.name.style.borderColor = 'red';
	    form.name.style.backgroundColor = '#ffe5e5';
        form.name.focus();
        
        return false;
    }

    if (email == '') {
        alert('O campo Email é obrigatório!');
       
        form.email.style.borderColor = 'red';
	    form.email.style.backgroundColor = '#ffe5e5';
        form.email.focus();
        
        return false;
    }

    if (password == '') {
        alert('O campo Senha é obrigatório!');
       
        form.password.style.borderColor = 'red';
	    form.password.style.backgroundColor = '#ffe5e5';
	    form.password.focus();
       
        return false;
    }

    if (re_password == '') {
        alert('O campo Confirmação de senha é obrigatório!');
       
        form.re_password.style.borderColor = 'red';
	    form.re_password.style.backgroundColor = '#ffe5e5';
	    form.re_password.focus();
       
        return false;
    }

    if(password !== re_password){
        alert('As senhas digitadas não coincidem!');
        
        form.re_password.value = '';
        form.re_password.focus();
        
        return false;
    } 
      
    return true;
}

