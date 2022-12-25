package oop.encapsulamento.casaB;

import oop.encapsulamento.casaA.Ana;

public class Julia {
    void testeAcessos() {
        Ana sogra = new Ana();
        //System.out.println(sogra.segredo);             //Não consegue ver porque o atributo é private
        /*System.out.println(sogra.facoDentroDeCasa);    //Consegue ver porque é default
        System.out.println(formaDeFalar);        //Consegue ver porque está no mesmo pacote (package)
        System.out.println(todosSabem);*/          //Consegue ver porque o atributo é público(todas as classes vem)
    }
}
