// script.js
function verificarResposta() {
    const resposta = document.getElementById('resposta').value.trim().toLowerCase();
    const mensagem = document.getElementById('mensagem');

    if (resposta === 'sim') {
        mensagem.textContent = 'Ele te ama também!';
        mensagem.style.color = 'green';
    } else {
        mensagem.textContent = 'Resposta errada, tente novamente.';
        mensagem.style.color = 'red';
    }
}
