

package com.example.projetoPW1;

import java.util.List;
import java.util.ArrayList;
import com.example.projetoPW1.modelo.Assinatura;
import com.example.projetoPW1.modelo.AssinaturaDAO;

public class App {
    
    public static void main(String[] args) {
        
        AssinaturaDAO assinaturaDAO = new AssinaturaDAO();
        String nome = "Estação Criativa";
        String descricao = "Perfeito para quem gosta de renovar inspirações com frequência. A cada mês, você recebe uma curadoria especial de produtos artesanais únicos, feitos à mão por criadores selecionados. Uma experiência leve, surpreendente e sempre atual — como as estações do ano.";
        float preco = (float)39.9;
        String tipo = "Mensal";
        List<Assinatura> assinaturas = null;
        
        assinaturaDAO.inserir(nome, descricao, preco, tipo);
        assinaturas = assinaturaDAO.obterTodos();
        
        assinaturaDAO.atualizar("Arquivo Afetivo", "No Correio Criativo, você recebe todo mês uma carta especial acompanhada de pequenos artesanatos feitos à mão — uma experiência íntima e surpreendente. Já o Arquivo Afetivo reúne esse encanto ao longo do ano, criando uma coleção única de memórias tangíveis.", (float)44.9, "Mensal", assinaturaDAO.obterPorNome("Estação Criativa").getId());
        
        assinaturaDAO.remover(assinaturaDAO.obterPorNome("Arquivo Afetivo").getId());
        
        
    }
    
    
}
