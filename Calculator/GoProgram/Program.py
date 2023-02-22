from Calculator.MVP.Model import Model
from Calculator.MVP.Presenter import Presenter
from Calculator.MVP.View import View


def main():
    presenter = Presenter(Model(), View())
    presenter.button_click()


class Program:

    main()






