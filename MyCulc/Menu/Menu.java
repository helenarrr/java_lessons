package MyCulc.Menu;

import MyCulc.Console.View;
import MyCulc.Model.CalcModel;
import MyCulc.Presenterrr.Presenter;

import java.util.Scanner;

public class Menu {
    Presenter presenter;
    View view;
    CalcModel calcModel;

    public Menu() {
        presenter = new Presenter(calcModel, view);
    }

    Scanner sc = new Scanner(System.in);

    public int val = sc.nextInt();

    }


