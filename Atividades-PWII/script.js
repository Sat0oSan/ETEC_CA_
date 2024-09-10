document.addEventListener("DOMContentLoaded", function() {
    // Dados dos jogadores
    const jogadores = {
        futebol: ["Neymar", "Cristiano Ronaldo", "Lionel Messi", "Kylian Mbappé"],
        volei: ["Giba", "Sérgio Santos", "Tandara Caixeta", "Sheilla Castro"],
        basquete: ["LeBron James", "Stephen Curry", "Giannis Antetokounmpo", "Kevin Durant"]
    };

    // Função para criar a lista de jogadores
    function criarLista(esporte, lista) {
        // Acessa o elemento <ul> pelo ID
        const ul = document.getElementById(lista);
        
        // Limpa a lista antes de adicionar novos itens
        ul.innerHTML = "";
        
        // Cria e adiciona os itens da lista
        jogadores[esporte].forEach(jogador => {
            // Cria um novo elemento <li>
            const li = document.createElement("li");
            
            // Define o texto do elemento <li>
            li.textContent = jogador;
            
            // Adiciona o elemento <li> à lista <ul>
            ul.appendChild(li);
        });
    }

    // Cria listas para cada esporte
    criarLista("futebol", "lista-futebol");
    criarLista("volei", "lista-volei");
    criarLista("basquete", "lista-basquete");
});
