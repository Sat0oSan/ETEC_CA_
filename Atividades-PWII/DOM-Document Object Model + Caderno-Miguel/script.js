document.addEventListener("DOMContentLoaded", function() {
    const cores = [
        "#FF5733", "#33FF57", "#3357FF", "#F333FF", "#33FFF5", "#F5FF33", "#FF8C33", "#8C33FF"
    ];
    let coresUsadas = [];

    // Função para criar os quadrados
    function criarQuadrados() {
        const container = document.getElementById("quadrados-container");

        for (let i = 0; i < 10; i++) {
            const quadrado = document.createElement("div");
            quadrado.className = "quadrado";
            quadrado.addEventListener("click", mudarCor);
            container.appendChild(quadrado);
        }
    }

    // Função para mudar a cor do quadrado clicado
    function mudarCor(event) {
        const quadrado = event.target;
        let corNova;

        // Escolhe uma cor que ainda não foi usada
        do {
            corNova = cores[Math.floor(Math.random() * cores.length)];
        } while (coresUsadas.includes(corNova) && coresUsadas.length < cores.length);

        // Se todas as cores foram usadas, limpa a lista
        if (coresUsadas.length === cores.length) {
            coresUsadas = [];
        }

        // Aplica a nova cor ao quadrado e registra a cor como usada
        quadrado.style.backgroundColor = corNova;
        coresUsadas.push(corNova);
    }

    // Cria os quadrados quando o documento estiver pronto
    criarQuadrados();
});
