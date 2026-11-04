package exercicios.praticas.crud;

import praticas.crud.controller.PessoasController;
import praticas.crud.view.PessoasView;

public class Main {

    public static void main(String[] args) {
        PessoasController controller = new PessoasController();
        PessoasView view = new PessoasView(controller);
        view.exibirMenu();
    }
 }