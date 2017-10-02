.(function verifica(aceitou)) {
      if (aceitou.checked)
        document.getElementById('enviar').disabled = false;
      else
        document.getElementById('enviar').disabled = true;
    }
