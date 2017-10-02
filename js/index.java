.(function verifica(aceitou)) {
      if (aceitou.checked)
        document.getElementById('enviar').disabled = false;
      else
        document.getElementById('enviar').disabled = true;
    }

.(function mostrar()) {
      if (mostrar.checked) {
        senha.type="text";
        senha2.type="text";
      } else {
        senha.type="password";
        senha2.type="password";
      }
    }
