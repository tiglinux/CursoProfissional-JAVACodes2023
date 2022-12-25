package oop.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
        //System.out.println(esposa.segredo);             //Não consegue ver porque o atributo é private
        System.out.println(esposa.facoDentroDeCasa);    //Consegue ver porque é default
        System.out.println(esposa.formaDeFalar);        //Consegue ver porque está no mesmo pacote (package)
        System.out.println(esposa.todosSabem);          //Consegue ver porque o atributo é público(todas as classes vem)
    }
}
