package app.controller;

import app.model.Loja;
import app.model.Produto;
import app.model.ProdutoHistorico;
import app.model.repository.LojaMongoRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("loja")
public class LojaController {

    @Autowired
    LojaMongoRepository aLojaRep;

    @RequestMapping("/add")
    public void incluirLoja(){

        ProdutoHistorico pHist = new ProdutoHistorico("1" , "2,50" , "2,45" , "10/02/2021");
        List<ProdutoHistorico> lpHist = new ArrayList<>();
        lpHist.add(pHist);

        List<Produto> pList = new ArrayList<>();
        Produto p = new Produto("1", "Cerveja" , "2,50" , "10/02/2021" , "sem imagem" , lpHist);
        pList.add(p);

        aLojaRep.save( new Loja("1" , "Super Legal" , "Mercado" , "10/02/2021" , pList));

        System.out.println("-------------------------------  Salvo");



        Gson gson = new Gson();
        System.out.println("--- Lista " + gson.toJson(aLojaRep.findAll()));

    }
}
